package br.embrapa.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.embrapa.event.RecursoCriadoEvent;
import br.embrapa.model.CadFrequencia;
import br.embrapa.repository.CadFrequenciaRepository;
import br.embrapa.service.CadFrequenciaService;

@RestController
@RequestMapping("/cadfrequencia")
public class CadFrequenciaResource {
	
	
	@Autowired
	private CadFrequenciaRepository cadFrequenciaRepository;
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADFREQUENCIA') and #oauth2.hasScope('read')")
	public List<CadFrequencia> Listar() {
		return cadFrequenciaRepository.findAll();
	}
	
	@Autowired
	private CadFrequenciaService cadFrequenciaService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_CADFREQUENCIA') and #oauth2.hasScope('write')")
	public ResponseEntity<CadFrequencia> criar(@RequestBody CadFrequencia cadFrequencia, HttpServletResponse response) {
		CadFrequencia cadFrequenciaSalva = cadFrequenciaRepository.save(cadFrequencia);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, cadFrequenciaSalva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(cadFrequenciaSalva);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADFREQUENCIA') and #oauth2.hasScope('read')")
	public CadFrequencia buscarPeloCodigo(@PathVariable Long codigo) {
		return cadFrequenciaRepository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_REMOVER_CADFREQUENCIA') and #oauth2.hasScope('write')")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		cadFrequenciaRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_CADFREQUENCIA') and #oauth2.hasScope('write')")
	public ResponseEntity<CadFrequencia> atualizar(@PathVariable Long codigo, @Valid @RequestBody CadFrequencia cadFrequencia) {
		CadFrequencia cadFrequenciaSalva = cadFrequenciaService.atualizar(codigo, cadFrequencia);
		return ResponseEntity.ok(cadFrequenciaSalva);
	}
}
