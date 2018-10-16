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
@Table(name="r17_verificador_template_m")
public class ModMonitoramentoVerificador {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="r17_codigo")
	private long codigo;
	
	@ManyToOne
	@JoinColumn(name="r17_cdempresa")
	private ModNivel4 cadEmpresa;
	
	@ManyToOne
	@JoinColumn(name="r17_cdverificador")
	private Verificador_m cdverificador;
	
	@ManyToOne
	@JoinColumn(name="r17_cdtipoverificador")
	private Verificador_m cdtipoverificador;
	
	@ManyToOne
	@JoinColumn(name="r17_cdtemplate")
	private ModMonitoramento cdtemplate;
	
	@ManyToOne
	@JoinColumn(name="r17_cdnivel1")
	private ModNivel4 cdnivel1;
	
	@ManyToOne
	@JoinColumn(name="r17_cdnivel2")
	private ModNivel4 cdnivel2;
	
	@ManyToOne
	@JoinColumn(name="r17_cdnivel3")
	private ModNivel4 cdnivel3;
	
	@ManyToOne
	@JoinColumn(name="r17_cdnivel4")
	private ModNivel4 cdnivel4;
	
	@Column(name="r17_lgdadosanaliticos")
	private boolean lgdadosanaliticos;
	
	@Column(name="r17_lgdadosagrupados")
	private boolean lgdadosagrupados;
	
	@Column(name="r17_txcoletaanalitica")
	private String txcoletaanalitica;
	
	@Column(name="r17_txcoletaagrupada")
	private String txcoletaagrupada;

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public ModNivel4 getCadEmpresa() {
		return cadEmpresa;
	}

	public void setCadEmpresa(ModNivel4 cadEmpresa) {
		this.cadEmpresa = cadEmpresa;
	}

	public Verificador_m getCdverificador() {
		return cdverificador;
	}

	public void setCdverificador(Verificador_m cdverificador) {
		this.cdverificador = cdverificador;
	}

	public Verificador_m getCdtipoverificador() {
		return cdtipoverificador;
	}

	public void setCdtipoverificador(Verificador_m cdtipoverificador) {
		this.cdtipoverificador = cdtipoverificador;
	}

	public ModMonitoramento getCdtemplate() {
		return cdtemplate;
	}

	public void setCdtemplate(ModMonitoramento cdtemplate) {
		this.cdtemplate = cdtemplate;
	}

	public ModNivel4 getCdnivel1() {
		return cdnivel1;
	}

	public void setCdnivel1(ModNivel4 cdnivel1) {
		this.cdnivel1 = cdnivel1;
	}

	public ModNivel4 getCdnivel2() {
		return cdnivel2;
	}

	public void setCdnivel2(ModNivel4 cdnivel2) {
		this.cdnivel2 = cdnivel2;
	}

	public ModNivel4 getCdnivel3() {
		return cdnivel3;
	}

	public void setCdnivel3(ModNivel4 cdnivel3) {
		this.cdnivel3 = cdnivel3;
	}

	public ModNivel4 getCdnivel4() {
		return cdnivel4;
	}

	public void setCdnivel4(ModNivel4 cdnivel4) {
		this.cdnivel4 = cdnivel4;
	}

	public boolean isLgdadosanaliticos() {
		return lgdadosanaliticos;
	}

	public void setLgdadosanaliticos(boolean lgdadosanaliticos) {
		this.lgdadosanaliticos = lgdadosanaliticos;
	}

	public boolean isLgdadosagrupados() {
		return lgdadosagrupados;
	}

	public void setLgdadosagrupados(boolean lgdadosagrupados) {
		this.lgdadosagrupados = lgdadosagrupados;
	}

	public String getTxcoletaanalitica() {
		return txcoletaanalitica;
	}

	public void setTxcoletaanalitica(String txcoletaanalitica) {
		this.txcoletaanalitica = txcoletaanalitica;
	}

	public String getTxcoletaagrupada() {
		return txcoletaagrupada;
	}

	public void setTxcoletaagrupada(String txcoletaagrupada) {
		this.txcoletaagrupada = txcoletaagrupada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (codigo ^ (codigo >>> 32));
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
		ModMonitoramentoVerificador other = (ModMonitoramentoVerificador) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	
	}

	

}
