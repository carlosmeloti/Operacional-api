package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="d02_tipo_verificador")
public class CadTipoDeVerificador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d02_cdtipoverificador")
	private Long cdTipoVerificador;
	
	@Column(name="d02_nmtipoverificador")
	private String nmTipoVerificador;
	
	@Column(name="d02_nrniveis")
	private Integer nrniveis;
	
	@Column(name="d02_rotulonivel1")
	private String rotulonivel1;
	
	@Column(name="d02_rotulonivel2")
	private String rotulonivel2;
	
	@Column(name="d02_rotulonivel3")
	private String rotulonivel3;
	
	@Column(name="d02_rotulonivel4")
	private String rotulonivel4;
	
	@Column(name="d02_rotulonivel5")
	private String rotulonivel5;

	public Long getCdTipoVerificador() {
		return cdTipoVerificador;
	}

	public void setCdTipoVerificador(Long cdTipoVerificador) {
		this.cdTipoVerificador = cdTipoVerificador;
	}

	public String getNmTipoVerificador() {
		return nmTipoVerificador;
	}

	public void setNmTipoVerificador(String nmTipoVerificador) {
		this.nmTipoVerificador = nmTipoVerificador;
	}

	public Integer getNrniveis() {
		return nrniveis;
	}

	public void setNrniveis(Integer nrniveis) {
		this.nrniveis = nrniveis;
	}

	public String getRotulonivel1() {
		return rotulonivel1;
	}

	public void setRotulonivel1(String rotulonivel1) {
		this.rotulonivel1 = rotulonivel1;
	}

	public String getRotulonivel2() {
		return rotulonivel2;
	}

	public void setRotulonivel2(String rotulonivel2) {
		this.rotulonivel2 = rotulonivel2;
	}

	public String getRotulonivel3() {
		return rotulonivel3;
	}

	public void setRotulonivel3(String rotulonivel3) {
		this.rotulonivel3 = rotulonivel3;
	}

	public String getRotulonivel4() {
		return rotulonivel4;
	}

	public void setRotulonivel4(String rotulonivel4) {
		this.rotulonivel4 = rotulonivel4;
	}

	public String getRotulonivel5() {
		return rotulonivel5;
	}

	public void setRotulonivel5(String rotulonivel5) {
		this.rotulonivel5 = rotulonivel5;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cdTipoVerificador == null) ? 0 : cdTipoVerificador.hashCode());
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
		CadTipoDeVerificador other = (CadTipoDeVerificador) obj;
		if (cdTipoVerificador == null) {
			if (other.cdTipoVerificador != null)
				return false;
		} else if (!cdTipoVerificador.equals(other.cdTipoVerificador))
			return false;
		return true;
	}
	
	
}
