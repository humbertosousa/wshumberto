package br.com.lojagama.beans;

public class Cliente {

	private String nome;
	private String email;
	private String fone;
	private Endereco endereco;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Cliente(String nome, String email, String fone, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.endereco = endereco;
	}
	public Cliente() {
		super();
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", fone=" + fone + ", endereco=" + endereco + "]";
	}
	
	
	
}
