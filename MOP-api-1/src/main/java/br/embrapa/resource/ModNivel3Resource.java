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
import br.embrapa.model.ModNivel3;
import br.embrapa.repository.ModNivel3Repository;
import br.embrapa.service.ModNivel3Service;

@RestController
@RequestMapping("/nivel_3")
public class ModNivel3Resource {
	
	@Autowired
	private ModNivel3Repository ModNivel3Repository;
	
	@GetMapping
	public List<ModNivel3> listar(){
		return ModNivel3Repository.findAll();
	}
	
	@Autowired
	private ModNivel3Service ModNivel3Service;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<ModNivel3> criar(@RequestBody ModNivel3 ModNivel3, HttpServletResponse response) {
		ModNivel3 ModNivel3Salva = ModNivel3Repository.save(ModNivel3);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, ModNivel3Salva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ModNivel3Salva);
	}
	
	@GetMapping("/{codigo}")
	public ModNivel3 buscarPeloCodigo(@PathVariable Long codigo) {
		return ModNivel3Repository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		ModNivel3Repository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<ModNivel3> atualizar(@PathVariable Long codigo, @Valid @RequestBody ModNivel3 cadModNivel3) {
		ModNivel3 ModNivel3Salva = ModNivel3Service.atualizar(codigo, cadModNivel3);
		return ResponseEntity.ok(ModNivel3Salva);
	}

}
