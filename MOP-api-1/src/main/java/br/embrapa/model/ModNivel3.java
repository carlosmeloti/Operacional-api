package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="d12_nivel3_m")
public class ModNivel3 {
		
	@Id
	@GeneratedValue
	@Column(name="d12_cdnivel3")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name="d12_cdempresa")
	private ModNivel2 cdEmpresa;
	
	@ManyToOne
	@JoinColumn(name="d12_cdnivel1")
	private ModNivel2 cdnivel1;
	
	@ManyToOne
	@JoinColumn(name="d12_cdnivel2")
	private ModNivel2 cdnivel2;
	
	@Column(name="d12_nmnivel3")
	private String nmnivel3;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public ModNivel2 getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(ModNivel2 cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public ModNivel2 getCdnivel1() {
		return cdnivel1;
	}

	public void setCdnivel1(ModNivel2 cdnivel1) {
		this.cdnivel1 = cdnivel1;
	}

	public ModNivel2 getCdnivel2() {
		return cdnivel2;
	}

	public void setCdnivel2(ModNivel2 cdnivel2) {
		this.cdnivel2 = cdnivel2;
	}

	public String getNmnivel3() {
		return nmnivel3;
	}

	public void setNmnivel3(String nmnivel3) {
		this.nmnivel3 = nmnivel3;
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
		ModNivel3 other = (ModNivel3) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
		
}
