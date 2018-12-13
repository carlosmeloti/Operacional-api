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
import br.embrapa.model.CadMaterial;
import br.embrapa.repository.CadMaterialRepository;
import br.embrapa.service.CadMaterialService;

@RestController
@RequestMapping("/cadmaterial")
public class CadMaterialResource {

	@Autowired
	private CadMaterialRepository cadMaterialRepository;
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADMATERIAL') and #oauth2.hasScope('read')")
	public List<CadMaterial> Listar() {
		return cadMaterialRepository.findAll();
	}
	
	@Autowired
	private CadMaterialService cadMaterialService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_CADMATERIAL') and #oauth2.hasScope('write')")
	public ResponseEntity<CadMaterial> criar(@RequestBody CadMaterial cadMaterial, HttpServletResponse response) {
		CadMaterial cadMaterialSalva = cadMaterialRepository.save(cadMaterial);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, cadMaterialSalva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(cadMaterialSalva);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADMATERIAL') and #oauth2.hasScope('read')")
	public CadMaterial buscarPeloCodigo(@PathVariable Long codigo) {
		return cadMaterialRepository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAuthority('ROLE_REMOVER_CADMATERIAL') and #oauth2.hasScope('write')")
	public void remover(@PathVariable Long codigo) {
		cadMaterialRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_CADMATERIAL') and #oauth2.hasScope('write')")
	public ResponseEntity<CadMaterial> atualizar(@PathVariable Long codigo, @Valid @RequestBody CadMaterial cadMaterial) {
		CadMaterial cadMaterialSalva = cadMaterialService.atualizar(codigo, cadMaterial);
		return ResponseEntity.ok(cadMaterialSalva);
	}
	
}
