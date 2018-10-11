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
@Table(name="d13_nivel4_m")
public class ModNivel4 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d13_cdnivel4")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name="d13_cdempresa")
	private ModNivel3 cdEmpresa;
	
	@ManyToOne
	@JoinColumn(name="d13_cdnivel1")
	private ModNivel3 cdnivel1;
	
	@ManyToOne
	@JoinColumn(name="d13_cdnivel2")
	private ModNivel3 cdnivel2;
	
	@ManyToOne
	@JoinColumn(name="d13_cdnivel3")
	private ModNivel3 cdnivel3;
	
	@Column(name="d13_nmnivel4")
	private String nmnivel4;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public ModNivel3 getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(ModNivel3 cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public ModNivel3 getCdnivel1() {
		return cdnivel1;
	}

	public void setCdnivel1(ModNivel3 cdnivel1) {
		this.cdnivel1 = cdnivel1;
	}

	public ModNivel3 getCdnivel2() {
		return cdnivel2;
	}

	public void setCdnivel2(ModNivel3 cdnivel2) {
		this.cdnivel2 = cdnivel2;
	}

	public ModNivel3 getCdnivel3() {
		return cdnivel3;
	}

	public void setCdnivel3(ModNivel3 cdnivel3) {
		this.cdnivel3 = cdnivel3;
	}
	
	

	public String getNmnivel4() {
		return nmnivel4;
	}

	public void setNmnivel4(String nmnivel4) {
		this.nmnivel4 = nmnivel4;
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
		ModNivel4 other = (ModNivel4) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	

}
