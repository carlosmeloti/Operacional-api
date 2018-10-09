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
@Table(name="d05_local3_m")
public class ModLocal3 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d05_cdlocal3")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name="d05_cdempresa")
	private ModLocal2 cdEmpresa;
	
	@ManyToOne
	@JoinColumn(name="d05_cdlocal1")
	private ModLocal2 cdLocal1;
	
	@ManyToOne
	@JoinColumn(name="d05_cdlocal2")
	private ModLocal2 cdLocal2;
	
		
	@Column(name="d05_nmlocal3")
	private String nmLocal3;


	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public ModLocal2 getCdEmpresa() {
		return cdEmpresa;
	}


	public void setCdEmpresa(ModLocal2 cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}


	public ModLocal2 getCdLocal1() {
		return cdLocal1;
	}


	public void setCdLocal1(ModLocal2 cdLocal1) {
		this.cdLocal1 = cdLocal1;
	}


	public ModLocal2 getCdLocal2() {
		return cdLocal2;
	}


	public void setCdLocal2(ModLocal2 cdLocal2) {
		this.cdLocal2 = cdLocal2;
	}


	public String getNmLocal3() {
		return nmLocal3;
	}


	public void setNmLocal3(String nmLocal3) {
		this.nmLocal3 = nmLocal3;
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
		ModLocal3 other = (ModLocal3) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	
	

}
