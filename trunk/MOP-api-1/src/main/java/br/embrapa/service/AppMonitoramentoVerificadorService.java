package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.AppMonitoramentoVerificador;
import br.embrapa.repository.AppMonitoramentoVerificadorRepository;

@Service
public class AppMonitoramentoVerificadorService {
	
	@Autowired
	private AppMonitoramentoVerificadorRepository appMonitoramentoVerificadorRepository;
	
	public AppMonitoramentoVerificador atualizar(Long codigo, AppMonitoramentoVerificador appMonitoramentoVerificador) {
		
		AppMonitoramentoVerificador appMonitoramentoVerificadorSalva = buscarAppMonitoramentoVerificadorPeloCodigo(codigo);
		BeanUtils.copyProperties(appMonitoramentoVerificador, appMonitoramentoVerificadorSalva, "codigo");
		return appMonitoramentoVerificadorRepository.save(appMonitoramentoVerificadorSalva);
	}
	
	

	public AppMonitoramentoVerificador buscarAppMonitoramentoVerificadorPeloCodigo(Long codigo) {
		AppMonitoramentoVerificador appMonitoramentoVerificadorSalva = appMonitoramentoVerificadorRepository.findOne(codigo);
		if (appMonitoramentoVerificadorSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return appMonitoramentoVerificadorSalva;
	}
			
	
}
