package br.embrapa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="d19_avaliacao")
public class AppAvaliacao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d19_cdavaliacao")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name="d19_cdempresa")
	private AppMonitoramento cdEmpresa;
	
	@ManyToOne
	@JoinColumn(name="d19_cdmonitoramento")
	private AppMonitoramento cdmonitoramento;
	
	@Column(name="d19_nmavaliacao")
	private String nmavaliacao;
	
	@Column(name="d19_dtinicio")
	private Date d19_dtinicio;
	
	@Column(name="d19_dtfim")
	private Date d19_dtfim;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public AppMonitoramento getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(AppMonitoramento cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public AppMonitoramento getCdmonitoramento() {
		return cdmonitoramento;
	}

	public void setCdmonitoramento(AppMonitoramento cdmonitoramento) {
		this.cdmonitoramento = cdmonitoramento;
	}

	public String getNmavaliacao() {
		return nmavaliacao;
	}

	public void setNmavaliacao(String nmavaliacao) {
		this.nmavaliacao = nmavaliacao;
	}

	public Date getD19_dtinicio() {
		return d19_dtinicio;
	}

	public void setD19_dtinicio(Date d19_dtinicio) {
		this.d19_dtinicio = d19_dtinicio;
	}

	public Date getD19_dtfim() {
		return d19_dtfim;
	}

	public void setD19_dtfim(Date d19_dtfim) {
		this.d19_dtfim = d19_dtfim;
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
		AppAvaliacao other = (AppAvaliacao) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
	
}
