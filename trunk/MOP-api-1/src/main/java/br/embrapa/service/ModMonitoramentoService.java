package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.ModMonitoramento;
import br.embrapa.repository.ModMonitoramentoRepository;

@Service
public class ModMonitoramentoService {
	
	@Autowired
	private ModMonitoramentoRepository modMonitoramentoRepository;

	public ModMonitoramento atualizar(Long codigo, ModMonitoramento modMonitoramento) {
		ModMonitoramento modMonitoramentoSalva = buscarModMonitoramentoPeloCodigo(codigo);
		BeanUtils.copyProperties(modMonitoramento, modMonitoramentoSalva, "codigo");
		return modMonitoramentoRepository.save(modMonitoramentoSalva);
	}
	
	

	public ModMonitoramento buscarModMonitoramentoPeloCodigo(Long codigo) {
		ModMonitoramento modMonitoramentoSalva = modMonitoramentoRepository.findOne(codigo);
		if (modMonitoramentoSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return modMonitoramentoSalva;
	}
	

}
