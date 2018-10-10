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
@Table(name="d10_nivel1_m")
public class ModNivel1 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d10_cdnivel1")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name="d10_cdempresa")
	private CadEmpresa cadEmpresa;
	
	@Column(name="d10_nmnivel1")
	private String nmnivel1;

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

	public String getNmnivel1() {
		return nmnivel1;
	}

	public void setNmnivel1(String nmnivel1) {
		this.nmnivel1 = nmnivel1;
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
		ModNivel1 other = (ModNivel1) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	} 
	
	
}
