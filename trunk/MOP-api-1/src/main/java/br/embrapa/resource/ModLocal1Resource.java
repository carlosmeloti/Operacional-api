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
import br.embrapa.model.ModLocal1;
import br.embrapa.repository.ModLocal1Repository;
import br.embrapa.service.ModLocal1Service;

@RestController
@RequestMapping("/unidadedeavaliacao")
public class ModLocal1Resource {

	@Autowired
	private ModLocal1Repository modLocal1Repository;
	
	@GetMapping
	public List<ModLocal1> listar(){
		return modLocal1Repository.findAll();
	}
	
	@Autowired
	private ModLocal1Service modLocal1Service;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<ModLocal1> criar(@RequestBody ModLocal1 modLocal1, HttpServletResponse response) {
		ModLocal1 modLocal1Salva = modLocal1Repository.save(modLocal1);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, modLocal1Salva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(modLocal1Salva);
	}
	
	@GetMapping("/{codigo}")
	public ModLocal1 buscarPeloCodigo(@PathVariable Long codigo) {
		return modLocal1Repository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		modLocal1Repository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<ModLocal1> atualizar(@PathVariable Long codigo, @Valid @RequestBody ModLocal1 cadModLocal1) {
		ModLocal1 modLocal1Salva = modLocal1Service.atualizar(codigo, cadModLocal1);
		return ResponseEntity.ok(modLocal1Salva);
	}
	
	
}
