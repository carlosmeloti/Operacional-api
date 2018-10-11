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
import br.embrapa.model.ModNivel4;
import br.embrapa.repository.ModNivel4Repository;
import br.embrapa.service.ModNivel4Service;

@RestController
@RequestMapping("/nivel_4")
public class ModNivel4Resource {
 
	@Autowired
	private ModNivel4Repository ModNivel4Repository;
	
	@GetMapping
	public List<ModNivel4> listar(){
		return ModNivel4Repository.findAll();
	}
	
	@Autowired
	private ModNivel4Service ModNivel4Service;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<ModNivel4> criar(@RequestBody ModNivel4 ModNivel4, HttpServletResponse response) {
		ModNivel4 ModNivel4Salva = ModNivel4Repository.save(ModNivel4);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, ModNivel4Salva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ModNivel4Salva);
	}
	
	@GetMapping("/{codigo}")
	public ModNivel4 buscarPeloCodigo(@PathVariable Long codigo) {
		return ModNivel4Repository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		ModNivel4Repository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<ModNivel4> atualizar(@PathVariable Long codigo, @Valid @RequestBody ModNivel4 cadModNivel4) {
		ModNivel4 ModNivel4Salva = ModNivel4Service.atualizar(codigo, cadModNivel4);
		return ResponseEntity.ok(ModNivel4Salva);
	}

	
}
