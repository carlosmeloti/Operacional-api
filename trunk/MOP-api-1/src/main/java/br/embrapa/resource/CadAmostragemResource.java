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
import br.embrapa.model.CadAmostragem;
import br.embrapa.repository.CadAmostragemRepository;
import br.embrapa.service.CadAmostragemService;


@RestController
@RequestMapping("/cadamostragem")
public class CadAmostragemResource {

	@Autowired
	private CadAmostragemRepository cadAmostragemRepository;
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADAMOSTRAGEM') and #oauth2.hasScope('read')")
	public List<CadAmostragem> Listar() {
		return cadAmostragemRepository.findAll();
	}
	
	@Autowired
	private CadAmostragemService cadAmostragemService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_CADAMOSTRAGEM') and #oauth2.hasScope('write')")
	public ResponseEntity<CadAmostragem> criar(@RequestBody CadAmostragem cadAmostragem, HttpServletResponse response) {
		CadAmostragem cadAmostragemSalva = cadAmostragemRepository.save(cadAmostragem);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, cadAmostragemSalva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(cadAmostragemSalva);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADAMOSTRAGEM') and #oauth2.hasScope('read')")
	public CadAmostragem buscarPeloCodigo(@PathVariable Long codigo) {
		return cadAmostragemRepository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAuthority('ROLE_REMOVER_CADAMOSTRAGEM') and #oauth2.hasScope('write')")
	public void remover(@PathVariable Long codigo) {
		cadAmostragemRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_CADAMOSTRAGEM') and #oauth2.hasScope('write')")
	public ResponseEntity<CadAmostragem> atualizar(@PathVariable Long codigo, @Valid @RequestBody CadAmostragem cadAmostragem) {
		CadAmostragem cadAmostragemSalva = cadAmostragemService.atualizar(codigo, cadAmostragem);
		return ResponseEntity.ok(cadAmostragemSalva);
	}
		
}
