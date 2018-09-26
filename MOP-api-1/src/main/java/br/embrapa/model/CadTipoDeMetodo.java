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
@Table(name="d07_tipo_metodo_m")
public class CadTipoDeMetodo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d07_cdtipometodo")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name="d07_cdempresa")
	private CadEmpresa cadEmpresa;
	
	@Column(name="d07_nmtipometodo")
	private String tipometodo;

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

	public String getTipometodo() {
		return tipometodo;
	}

	public void setTipometodo(String tipometodo) {
		this.tipometodo = tipometodo;
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
		CadTipoDeMetodo other = (CadTipoDeMetodo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
}
