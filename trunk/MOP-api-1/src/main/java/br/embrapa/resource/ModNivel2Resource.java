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
import br.embrapa.model.ModNivel2;
import br.embrapa.repository.ModNivel2Repository;
import br.embrapa.service.ModNivel2Service;

@RestController
@RequestMapping("/nivel_2")
public class ModNivel2Resource {

	@Autowired
	private ModNivel2Repository ModNivel2Repository;
	
	@GetMapping
	public List<ModNivel2> listar(){
		return ModNivel2Repository.findAll();
	}
	
	@Autowired
	private ModNivel2Service ModNivel2Service;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<ModNivel2> criar(@RequestBody ModNivel2 ModNivel2, HttpServletResponse response) {
		ModNivel2 ModNivel2Salva = ModNivel2Repository.save(ModNivel2);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, ModNivel2Salva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ModNivel2Salva);
	}
	
	@GetMapping("/{codigo}")
	public ModNivel2 buscarPeloCodigo(@PathVariable Long codigo) {
		return ModNivel2Repository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		ModNivel2Repository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<ModNivel2> atualizar(@PathVariable Long codigo, @Valid @RequestBody ModNivel2 cadModNivel2) {
		ModNivel2 ModNivel2Salva = ModNivel2Service.atualizar(codigo, cadModNivel2);
		return ResponseEntity.ok(ModNivel2Salva);
	}
	
}
