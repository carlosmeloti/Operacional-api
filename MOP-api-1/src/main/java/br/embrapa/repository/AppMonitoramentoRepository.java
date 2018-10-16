package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.AppMonitoramento;

public interface AppMonitoramentoRepository extends JpaRepository<AppMonitoramento, Long>{

}
