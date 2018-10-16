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
import br.embrapa.model.AppMonitoramento;
import br.embrapa.repository.AppMonitoramentoRepository;
import br.embrapa.service.AppMonitoramentoService;

@RestController
@RequestMapping("/appmonitoriamento")
public class AppMonitoramentoResource {
	
	@Autowired
	private AppMonitoramentoRepository appMonitoramentoRepository;
	
	@GetMapping
	public List<AppMonitoramento> listar(){
		return appMonitoramentoRepository.findAll();
	}
	
	@Autowired
	private AppMonitoramentoService appMonitoramentoService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<AppMonitoramento> criar(@RequestBody AppMonitoramento AppMonitoramento, HttpServletResponse response) {
		AppMonitoramento AppMonitoramentoSalva = appMonitoramentoRepository.save(AppMonitoramento);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, AppMonitoramentoSalva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(AppMonitoramentoSalva);
	}
	
	@GetMapping("/{codigo}")
	public AppMonitoramento buscarPeloCodigo(@PathVariable Long codigo) {
		return appMonitoramentoRepository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		appMonitoramentoRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<AppMonitoramento> atualizar(@PathVariable Long codigo, @Valid @RequestBody AppMonitoramento cadAppMonitoramento) {
		AppMonitoramento AppMonitoramentoSalva = appMonitoramentoService.atualizar(codigo, cadAppMonitoramento);
		return ResponseEntity.ok(AppMonitoramentoSalva);
	}
}
