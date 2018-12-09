package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="r15_verificador_local_m")
public class ModVerificadorLocal {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="r15_cdempresa")
	private Verificador_m cadEmpresa;
	
	
	@ManyToOne
	@JoinColumn(name="r15_cdverificador")
	private Verificador_m codigo;
	
	@ManyToOne
	@JoinColumn(name="r15_cdtipoverificador")
	private Verificador_m cdtipoverificador;
	
	@ManyToOne
	@JoinColumn(name="r15_cdlocal1")
	private ModLocal3 cdlocal1;
	
	@ManyToOne
	@JoinColumn(name="r15_cdlocal2")
	private ModLocal3 cdlocal2;
	
	@ManyToOne
	@JoinColumn(name="r15_cdlocal3")
	private ModLocal3 cdlocal3;
	
	@ManyToOne
	@JoinColumn(name="r15_cdtipometodo")
	private CadTipoDeMetodo cdtipometodo;
	
	@Column(name="r15_txmetodologia")
	private String txmetodologia;
	
	@ManyToOne
	@JoinColumn(name="r15_cdfrequencia")
	private CadFrequencia cdfrequencia;
	
	@ManyToOne
	@JoinColumn(name="r15_cdamostragem")
	private CadAmostragem cdamostragem;

	
	
	

	public Verificador_m getCadEmpresa() {
		return cadEmpresa;
	}

	public void setCadEmpresa(Verificador_m cadEmpresa) {
		this.cadEmpresa = cadEmpresa;
	}

	public Verificador_m getCodigo() {
		return codigo;
	}

	public void setCodigo(Verificador_m codigo) {
		this.codigo = codigo;
	}

	public Verificador_m getCdtipoverificador() {
		return cdtipoverificador;
	}

	public void setCdtipoverificador(Verificador_m cdtipoverificador) {
		this.cdtipoverificador = cdtipoverificador;
	}

	public ModLocal3 getCdlocal1() {
		return cdlocal1;
	}

	public void setCdlocal1(ModLocal3 cdlocal1) {
		this.cdlocal1 = cdlocal1;
	}

	public ModLocal3 getCdlocal2() {
		return cdlocal2;
	}

	public void setCdlocal2(ModLocal3 cdlocal2) {
		this.cdlocal2 = cdlocal2;
	}

	public ModLocal3 getCdlocal3() {
		return cdlocal3;
	}

	public void setCdlocal3(ModLocal3 cdlocal3) {
		this.cdlocal3 = cdlocal3;
	}

	public CadTipoDeMetodo getCdtipometodo() {
		return cdtipometodo;
	}

	public void setCdtipometodo(CadTipoDeMetodo cdtipometodo) {
		this.cdtipometodo = cdtipometodo;
	}

	public String getTxmetodologia() {
		return txmetodologia;
	}

	public void setTxmetodologia(String txmetodologia) {
		this.txmetodologia = txmetodologia;
	}

	public CadFrequencia getCdfrequencia() {
		return cdfrequencia;
	}

	public void setCdfrequencia(CadFrequencia cdfrequencia) {
		this.cdfrequencia = cdfrequencia;
	}

	public CadAmostragem getCdamostragem() {
		return cdamostragem;
	}

	public void setCdamostragem(CadAmostragem cdamostragem) {
		this.cdamostragem = cdamostragem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ModVerificadorLocal other = (ModVerificadorLocal) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
		
}
