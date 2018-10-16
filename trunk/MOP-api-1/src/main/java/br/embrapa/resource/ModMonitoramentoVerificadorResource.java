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
import br.embrapa.model.ModMonitoramentoVerificador;
import br.embrapa.repository.ModMonitoramentoVerificadorRepository;
import br.embrapa.service.ModMonitoramentoVerificadorService;

@RestController
@RequestMapping("/modmonitoramentoverificador")
public class ModMonitoramentoVerificadorResource {

	@Autowired
	private ModMonitoramentoVerificadorRepository ModMonitoramentoVerificadorRepository;
	
	@GetMapping
	public List<ModMonitoramentoVerificador> listar(){
		return ModMonitoramentoVerificadorRepository.findAll();
	}
	
	@Autowired
	private ModMonitoramentoVerificadorService ModMonitoramentoVerificadorService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<ModMonitoramentoVerificador> criar(@RequestBody ModMonitoramentoVerificador ModMonitoramentoVerificador, HttpServletResponse response) {
		ModMonitoramentoVerificador ModMonitoramentoVerificadorSalva = ModMonitoramentoVerificadorRepository.save(ModMonitoramentoVerificador);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, ModMonitoramentoVerificadorSalva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ModMonitoramentoVerificadorSalva);
	}
	
	@GetMapping("/{codigo}")
	public ModMonitoramentoVerificador buscarPeloCodigo(@PathVariable Long codigo) {
		return ModMonitoramentoVerificadorRepository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		ModMonitoramentoVerificadorRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<ModMonitoramentoVerificador> atualizar(@PathVariable Long codigo, @Valid @RequestBody ModMonitoramentoVerificador cadModMonitoramentoVerificador) {
		ModMonitoramentoVerificador ModMonitoramentoVerificadorSalva = ModMonitoramentoVerificadorService.atualizar(codigo, cadModMonitoramentoVerificador);
		return ResponseEntity.ok(ModMonitoramentoVerificadorSalva);
	}

	
}
