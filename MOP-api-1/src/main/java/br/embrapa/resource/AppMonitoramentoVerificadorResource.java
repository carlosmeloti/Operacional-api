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
import br.embrapa.model.AppMonitoramentoVerificador;
import br.embrapa.repository.AppMonitoramentoVerificadorRepository;
import br.embrapa.service.AppMonitoramentoVerificadorService;

@RestController
@RequestMapping("/appmonitoramentoverificador")
public class AppMonitoramentoVerificadorResource {

	@Autowired
	private AppMonitoramentoVerificadorRepository appMonitoramentoVerificadorRepository;
	
	@GetMapping
	public List<AppMonitoramentoVerificador> listar(){
		return appMonitoramentoVerificadorRepository.findAll();
	}
	
	@Autowired
	private AppMonitoramentoVerificadorService appMonitoramentoVerificadorService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<AppMonitoramentoVerificador> criar(@RequestBody AppMonitoramentoVerificador AppMonitoramentoVerificador, HttpServletResponse response) {
		AppMonitoramentoVerificador AppMonitoramentoVerificadorSalva = appMonitoramentoVerificadorRepository.save(AppMonitoramentoVerificador);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, AppMonitoramentoVerificadorSalva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(AppMonitoramentoVerificadorSalva);
	}
	
	@GetMapping("/{codigo}")
	public AppMonitoramentoVerificador buscarPeloCodigo(@PathVariable Long codigo) {
		return appMonitoramentoVerificadorRepository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		appMonitoramentoVerificadorRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<AppMonitoramentoVerificador> atualizar(@PathVariable Long codigo, @Valid @RequestBody AppMonitoramentoVerificador cadAppMonitoramentoVerificador) {
		AppMonitoramentoVerificador AppMonitoramentoVerificadorSalva = appMonitoramentoVerificadorService.atualizar(codigo, cadAppMonitoramentoVerificador);
		return ResponseEntity.ok(AppMonitoramentoVerificadorSalva);
	}
	
}
