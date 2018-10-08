package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="r15_verificador_local_m")
public class ModVerificadorLocal {

	@ManyToOne
	@JoinColumn(name="r15_cdempresa", referencedColumnName="p01_cadEmpresa")
	private Verificador_m cadEmpresa;
	
	@ManyToOne
	@JoinColumn(name="r15_cdverificador", referencedColumnName="p01_cdverificador")
	private Verificador_m codigo;
	
	@ManyToOne
	@JoinColumn(name="r15_cdverificador", referencedColumnName="p01_cdtipoverificador")
	private Verificador_m cdtipoverificador;
	
	@ManyToOne
	@JoinColumn(name="r15_cdlocal1", referencedColumnName="d05_cdlocal1")
	private ModLocal3 cdlocal1;
	
	@ManyToOne
	@JoinColumn(name="r15_cdlocal2", referencedColumnName="d05_cdlocal2")
	private ModLocal3 cdlocal2;
	
	@ManyToOne
	@JoinColumn(name="r15_cdlocal3", referencedColumnName="d05_cdlocal3")
	private ModLocal3 cdlocal3;
	
	@ManyToOne
	@JoinColumn(name="r15_cdtipometodo", referencedColumnName="d07_cdtipometodo")
	private CadTipoDeMetodo cdtipometodo;
	
	@Column(name="r15_txmetodologia")
	private String txmetodologia;
	
	@ManyToOne
	@JoinColumn(name="r15_cdfrequencia", referencedColumnName="d08_cdfrequencia")
	private CadFrequencia cdfrequencia;
	
	@ManyToOne
	@JoinColumn(name="r15_cdamostragem", referencedColumnName="d06_cdamostragem")
	private CadAmostragem cdamostragem;
	
	
	
	
	
		
}
