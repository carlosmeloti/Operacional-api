package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="d11_nivel2_m")
public class ModNivel2 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d11_cdnivel2")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name="d11_cdempresa")
	private ModNivel1 cdEmpresa;
	
	@ManyToOne
	@JoinColumn(name="d11_cdnivel1")
	private ModNivel1 modNivel1;
	
	@Column(name="d11_nmnivel2")
	private String nmnivel2;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public ModNivel1 getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(ModNivel1 cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public ModNivel1 getModNivel1() {
		return modNivel1;
	}

	public void setModNivel1(ModNivel1 modNivel1) {
		this.modNivel1 = modNivel1;
	}

	public String getNmnivel2() {
		return nmnivel2;
	}

	public void setNmnivel2(String nmnivel2) {
		this.nmnivel2 = nmnivel2;
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
		ModNivel2 other = (ModNivel2) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
	
	

}
