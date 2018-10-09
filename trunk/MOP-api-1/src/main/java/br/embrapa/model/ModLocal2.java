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
@Table(name="d04_local2_m")
public class ModLocal2 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d04_cdlocal2")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name="d04_cdlocal1")
	private ModLocal1 cdLocal1;
	
	@ManyToOne
	@JoinColumn(name="d04_cdempresa")
	private ModLocal1 cdEmpresa;
	
	@Column(name="d04_nmlocal2")
	private String nmLocal2;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public ModLocal1 getCdLocal1() {
		return cdLocal1;
	}

	public void setCdLocal1(ModLocal1 cdLocal1) {
		this.cdLocal1 = cdLocal1;
	}

	public ModLocal1 getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(ModLocal1 cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getNmLocal2() {
		return nmLocal2;
	}

	public void setNmLocal2(String nmLocal2) {
		this.nmLocal2 = nmLocal2;
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
		ModLocal2 other = (ModLocal2) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	

}
