package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="d20_nivel_avaliacao")
public class CadNivelDeAvaliacao {

	@Id
	@Column(name="d20_cdnivelavaliacao")
	private Long codigo;
	
	@Column(name="d20_nmnivelavaliacao")
	private String nmnivelavaliacao;
	
	@Column(name="d20_sigla")
	private String sigla;
	
	@Column(name="d20_txdescricao")
	private String txdescricao;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNmnivelavaliacao() {
		return nmnivelavaliacao;
	}

	public void setNmnivelavaliacao(String nmnivelavaliacao) {
		this.nmnivelavaliacao = nmnivelavaliacao;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getTxdescricao() {
		return txdescricao;
	}

	public void setTxdescricao(String txdescricao) {
		this.txdescricao = txdescricao;
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
		CadNivelDeAvaliacao other = (CadNivelDeAvaliacao) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}


	
	
	
}
