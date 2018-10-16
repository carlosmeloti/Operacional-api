package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.ModMonitoramentoVerificador;
import br.embrapa.repository.ModMonitoramentoVerificadorRepository;

@Service
public class ModMonitoramentoVerificadorService {

	@Autowired
	private ModMonitoramentoVerificadorRepository modMonitoramentoVerificadorRepository;

	public ModMonitoramentoVerificador atualizar(Long codigo, ModMonitoramentoVerificador modMonitoramentoVerificador) {
		ModMonitoramentoVerificador modMonitoramentoVerificadorSalva = buscarModMonitoramentoVerificadorPeloCodigo(codigo);
		BeanUtils.copyProperties(modMonitoramentoVerificador, modMonitoramentoVerificadorSalva, "codigo");
		return modMonitoramentoVerificadorRepository.save(modMonitoramentoVerificadorSalva);
	}
	
	

	public ModMonitoramentoVerificador buscarModMonitoramentoVerificadorPeloCodigo(Long codigo) {
		ModMonitoramentoVerificador modMonitoramentoVerificadorSalva = modMonitoramentoVerificadorRepository.findOne(codigo);
		if (modMonitoramentoVerificadorSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return modMonitoramentoVerificadorSalva;
	}
}
