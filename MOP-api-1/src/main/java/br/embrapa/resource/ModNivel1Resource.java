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
import br.embrapa.model.ModNivel1;
import br.embrapa.repository.ModNivel1Repository;
import br.embrapa.service.ModNivel1Service;

@RestController
@RequestMapping("/nivel_1")
public class ModNivel1Resource {
	
	@Autowired
	private ModNivel1Repository ModNivel1Repository;
	
	@GetMapping
	public List<ModNivel1> listar(){
		return ModNivel1Repository.findAll();
	}
	
	@Autowired
	private ModNivel1Service ModNivel1Service;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<ModNivel1> criar(@RequestBody ModNivel1 ModNivel1, HttpServletResponse response) {
		ModNivel1 ModNivel1Salva = ModNivel1Repository.save(ModNivel1);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, ModNivel1Salva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ModNivel1Salva);
	}
	
	@GetMapping("/{codigo}")
	public ModNivel1 buscarPeloCodigo(@PathVariable Long codigo) {
		return ModNivel1Repository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		ModNivel1Repository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<ModNivel1> atualizar(@PathVariable Long codigo, @Valid @RequestBody ModNivel1 cadModNivel1) {
		ModNivel1 ModNivel1Salva = ModNivel1Service.atualizar(codigo, cadModNivel1);
		return ResponseEntity.ok(ModNivel1Salva);
	}
	

}
