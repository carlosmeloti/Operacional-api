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
import br.embrapa.model.AppAvaliacao;
import br.embrapa.repository.AppAvaliacaoRepository;
import br.embrapa.service.AppAvaliacaoService;

@RestController
@RequestMapping("/appavaliacao")
public class AppAvaliacaoResource {

	@Autowired
	private AppAvaliacaoRepository appAvaliacaoRepository;
	
	@GetMapping
	public List<AppAvaliacao> listar(){
		return appAvaliacaoRepository.findAll();
	}
	
	@Autowired
	private AppAvaliacaoService appAvaliacaoService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<AppAvaliacao> criar(@RequestBody AppAvaliacao AppAvaliacao, HttpServletResponse response) {
		AppAvaliacao AppAvaliacaoSalva = appAvaliacaoRepository.save(AppAvaliacao);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, AppAvaliacaoSalva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(AppAvaliacaoSalva);
	}
	
	@GetMapping("/{codigo}")
	public AppAvaliacao buscarPeloCodigo(@PathVariable Long codigo) {
		return appAvaliacaoRepository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		appAvaliacaoRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<AppAvaliacao> atualizar(@PathVariable Long codigo, @Valid @RequestBody AppAvaliacao cadAppAvaliacao) {
		AppAvaliacao AppAvaliacaoSalva = appAvaliacaoService.atualizar(codigo, cadAppAvaliacao);
		return ResponseEntity.ok(AppAvaliacaoSalva);
	}
	
}
