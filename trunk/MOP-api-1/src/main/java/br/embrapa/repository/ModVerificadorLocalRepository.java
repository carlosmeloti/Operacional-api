package br.embrapa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.ModVerificadorLocal;

public interface ModVerificadorLocalRepository extends JpaRepository<ModVerificadorLocal, Serializable> {

}
