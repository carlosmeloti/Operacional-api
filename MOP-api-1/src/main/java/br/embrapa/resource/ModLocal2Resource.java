package br.embrapa.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import br.embrapa.model.ModLocal2;
import br.embrapa.repository.ModLocal2Repository;
import br.embrapa.service.ModLocal2Service;

@RestController
@RequestMapping("/localdeavaliacao")
public class ModLocal2Resource {

	@Autowired
	private ModLocal2Repository modLocal2Repository;
	
	@GetMapping
	public List<ModLocal2> listar(){
		return modLocal2Repository.findAll();
	}
	
	@Autowired
	private ModLocal2Service modLocal2Service;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<ModLocal2> criar(@RequestBody ModLocal2 modLocal2, HttpServletResponse response) {
		ModLocal2 modLocal2Salva = modLocal2Repository.save(modLocal2);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, modLocal2Salva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(modLocal2Salva);
	}
	
	@GetMapping("/{codigo}")
	public ModLocal2 buscarPeloCodigo(@PathVariable Long codigo) {
		return modLocal2Repository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		modLocal2Repository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<ModLocal2> atualizar(@PathVariable Long codigo, @Valid @RequestBody ModLocal2 cadModLocal2) {
		ModLocal2 modLocal2Salva = modLocal2Service.atualizar(codigo, cadModLocal2);
		return ResponseEntity.ok(modLocal2Salva);
	}
	
	
}
