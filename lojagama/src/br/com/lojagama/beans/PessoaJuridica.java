package br.com.lojagama.beans;

public class PessoaJuridica extends Cliente{

	private String cnpj;
	private String cnae;
	private String contato;
	
	public String getDocumentos() {
		return cnpj + ";" + cnae;
	}
	
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", cnae=" + cnae + ", contato=" + contato + ", toString()="
				+ super.toString() + "]";
	}

	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, String email, String fone, Endereco endereco, String cnpj, String cnae,
			String contato) {
		super(nome, email, fone, endereco);
		this.cnpj = cnpj;
		this.cnae = cnae;
		this.contato = contato;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getCnae() {
		return cnae;
	}
	public void setCnae(String cnae) {
		this.cnae = cnae;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	
	
	
}
