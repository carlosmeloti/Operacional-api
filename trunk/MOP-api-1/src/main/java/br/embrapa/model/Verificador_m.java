package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="p01_verificador_m")
public class Verificador_m {

	@Id
	@Column(name="p01_cdverificador")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name="p01_cdempresa")
	private CadEmpresa cadEmpresa;
	
	@ManyToOne
	@JoinColumn(name="p01_cdtipoverificador")
	private CadTipoDeVerificador cadTipoDeVerificador;
	
	@ManyToOne
	@JoinColumn(name="p01_cdnivelavaliacao")
	private CadNivelDeAvaliacao cadNivelDeAvaliacao;
	
	@Column(name="p01_codalfa")
	private String codalfa;
	
	@Column(name="p01_nmverificador")
	private String nmverificador;
	
	@Column(name="p01_limiar")
	private String limiar;
	
	@Column(name="p01_graco")
	private Double p01_graco;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public CadEmpresa getCadEmpresa() {
		return cadEmpresa;
	}

	public void setCadEmpresa(CadEmpresa cadEmpresa) {
		this.cadEmpresa = cadEmpresa;
	}

	public CadTipoDeVerificador getCadTipoDeVerificador() {
		return cadTipoDeVerificador;
	}

	public void setCadTipoDeVerificador(CadTipoDeVerificador cadTipoDeVerificador) {
		this.cadTipoDeVerificador = cadTipoDeVerificador;
	}

	public CadNivelDeAvaliacao getCadNivelDeAvaliacao() {
		return cadNivelDeAvaliacao;
	}

	public void setCadNivelDeAvaliacao(CadNivelDeAvaliacao cadNivelDeAvaliacao) {
		this.cadNivelDeAvaliacao = cadNivelDeAvaliacao;
	}

	public String getCodalfa() {
		return codalfa;
	}

	public void setCodalfa(String codalfa) {
		this.codalfa = codalfa;
	}

	public String getNmverificador() {
		return nmverificador;
	}

	public void setNmverificador(String nmverificador) {
		this.nmverificador = nmverificador;
	}

	public String getLimiar() {
		return limiar;
	}

	public void setLimiar(String limiar) {
		this.limiar = limiar;
	}

	public Double getP01_graco() {
		return p01_graco;
	}

	public void setP01_graco(Double p01_graco) {
		this.p01_graco = p01_graco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Verificador_m other = (Verificador_m) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
