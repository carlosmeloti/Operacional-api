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
import br.embrapa.model.CadEmpresa;
import br.embrapa.repository.CadEmpresaRepository;
import br.embrapa.service.CadEmpresaService;

@RestController
@RequestMapping("/cadempresa")
public class CadEmpresaResource {
	
	@Autowired
	private CadEmpresaRepository cadEmpresaRepository;

	@Autowired
	private CadEmpresaService cadEmpresaService;
	
	
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<CadEmpresa> listar(){
		return cadEmpresaRepository.findAll();
	}
	
		
	@PostMapping
	public ResponseEntity<CadEmpresa> criar(@RequestBody CadEmpresa cadEmpresa, HttpServletResponse response) {
		CadEmpresa cadEmpresaSalva = cadEmpresaRepository.save(cadEmpresa);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, cadEmpresaSalva.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(cadEmpresaSalva);
	}
	
	@GetMapping("/{codigo}")
	public CadEmpresa buscarPeloCodigo(@PathVariable Long codigo) {
		return cadEmpresaRepository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		cadEmpresaRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<CadEmpresa> atualizar(@PathVariable Long codigo, @Valid @RequestBody CadEmpresa cadEmpresa) {
		CadEmpresa cadEmpresaSalva = cadEmpresaService.atualizar(codigo, cadEmpresa);
		return ResponseEntity.ok(cadEmpresaSalva);
	}
	
	
	
	
	
	
}

