package br.embrapa.model;

import java.util.Date;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="d18_monitoramento")
public class AppMonitoramento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d18_cdmonitoramento")
	private Long codigo;
	
	@Column(name="d18_cdempresa")
	private String cdEmpresa;
	
	@Column(name="d18_nmmonitoramento")
	private String nmmonitoramento;
	
	@ManyToOne
	@JoinColumn(name="d18_cdtipoverificador")
	private CadTipoDeVerificador cdtipoverificador;
	
	@Column(name="d18_dtcriacao")
	Date dtcriacao;
	
	@Column(name="d18_txlocal")
	private String txlocal;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getCdEmpresa() {
		return cdEmpresa;
	}

	public void setCdEmpresa(String cdEmpresa) {
		this.cdEmpresa = cdEmpresa;
	}

	public String getNmmonitoramento() {
		return nmmonitoramento;
	}

	public void setNmmonitoramento(String nmmonitoramento) {
		this.nmmonitoramento = nmmonitoramento;
	}

	public CadTipoDeVerificador getCdtipoverificador() {
		return cdtipoverificador;
	}

	public void setCdtipoverificador(CadTipoDeVerificador cdtipoverificador) {
		this.cdtipoverificador = cdtipoverificador;
	}

	public String getDtcriacao() {
		
		String timeStamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(dtcriacao);
		return timeStamp;
	}

	public void setDtcriacao(Date dtcriacao) {
		this.dtcriacao = dtcriacao;
	}

	public String getTxlocal() {
		return txlocal;
	}

	public void setTxlocal(String txlocal) {
		this.txlocal = txlocal;
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
		AppMonitoramento other = (AppMonitoramento) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
}
