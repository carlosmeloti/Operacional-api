package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="d14_template")
public class ModMonitoramento {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d14_cdtemplate")
	private Long codigo;
	
	@Column(name="d14_nmtemplate")
	private String nmtemplate;
	
	@Column(name="d14_cdtipoverificador")
	private long cdtipoverificador;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNmtemplate() {
		return nmtemplate;
	}

	public void setNmtemplate(String nmtemplate) {
		this.nmtemplate = nmtemplate;
	}

	public long getCdtipoverificador() {
		return cdtipoverificador;
	}

	public void setCdtipoverificador(long cdtipoverificador) {
		this.cdtipoverificador = cdtipoverificador;
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
		ModMonitoramento other = (ModMonitoramento) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
}
