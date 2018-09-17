package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="d24_empresa")
public class CadEmpresa {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="d24_cdempresa")
	private Long codigo;
	
	@Column(name="d24_nmempresa")
	private String nmEmpresa;
	
	@Column(name="d24_nmabreviado")
	private String nmAbreviado;
	
	@Column(name="d24_nrtelefone")
	private String nrTelefone;
	
	@Column(name="d24_enderecocompleto")
	private String enderecoCompleto;
	
	@Column(name="d24_txpessoacontato")
	private String pessoContato;
	
	@Column(name="d24_cnpjempresa")
	private String cnpjEmpresa;
	
	@Column(name="d24_diretorioarquivos")
	private String diretorioArquivos;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNmEmpresa() {
		return nmEmpresa;
	}

	public void setNmEmpresa(String nmEmpresa) {
		this.nmEmpresa = nmEmpresa;
	}

	public String getNmAbreviado() {
		return nmAbreviado;
	}

	public void setNmAbreviado(String nmAbreviado) {
		this.nmAbreviado = nmAbreviado;
	}

	public String getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}

	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}

	public String getPessoContato() {
		return pessoContato;
	}

	public void setPessoContato(String pessoContato) {
		this.pessoContato = pessoContato;
	}

	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}

	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}

	public String getDiretorioArquivos() {
		return diretorioArquivos;
	}

	public void setDiretorioArquivos(String diretorioArquivos) {
		this.diretorioArquivos = diretorioArquivos;
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
		CadEmpresa other = (CadEmpresa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
}
