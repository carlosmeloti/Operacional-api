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
import br.embrapa.model.ModMonitoramento;
import br.embrapa.repository.ModMonitoramentoRepository;
import br.embrapa.service.ModMonitoramentoService;

@RestController
@RequestMapping("/modmonitoramento")
public class ModMonitoramentoResource {

	@Autowired
	private ModMonitoramentoRepository ModMonitoramentoRepository;
	
	@GetMapping
	public List<ModMonitoramento> listar(){
		return ModMonitoramentoRepository.findAll();
	}
	
	@Autowired
	private ModMonitoramentoService ModMonitoramentoService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<ModMonitoramento> criar(@RequestBody ModMonitoramento ModMonitoramento, HttpServletResponse response) {
		ModMonitoramento ModMonitoramentoSalva = ModMonitoramentoRepository.save(ModMonitoramento);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, ModMonitoramentoSalva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ModMonitoramentoSalva);
	}
	
	@GetMapping("/{codigo}")
	public ModMonitoramento buscarPeloCodigo(@PathVariable Long codigo) {
		return ModMonitoramentoRepository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		ModMonitoramentoRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<ModMonitoramento> atualizar(@PathVariable Long codigo, @Valid @RequestBody ModMonitoramento cadModMonitoramento) {
		ModMonitoramento ModMonitoramentoSalva = ModMonitoramentoService.atualizar(codigo, cadModMonitoramento);
		return ResponseEntity.ok(ModMonitoramentoSalva);
	}

	
}
