package br.com.unixyz.modelo;
/*
 * Design Pattern: compilado de padr�es de projetos para OO.
 * Um dos padr�es � o DTO (Data Transfer Object) cuja fun��o � aplicar
 * boa pr�tica na transi��o entre o projeto e a programa��o.
 * Sugest�es:
 * 1� TODOS os atributos devem estar como privados.
 * 2� Cada atributo deve possuir um m�todo set e outro m�todo get.
 * 3� No MINIMO dois construtores, sendo um vazio e outro com 
 * todos os atributos sendo preenchidos. (cheio)
 */

public class Aluno {

	private int rm;
	private String nome;
	private String email;
	private String fone;
	private String cpf;
	private Endereco endereco;
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Aluno [rm=" + rm + ", nome=" + nome + ", email=" + email + ", fone=" + fone + ", cpf=" + cpf
				+ ", endereco=" + endereco + "]";
	}
	public Aluno(int rm, String nome, String email, String fone, String cpf, Endereco endereco) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	public Aluno() {}
	
	public Aluno (int rm) {
		this.rm = rm;
	}
	public Aluno(int rm, String nome) {
		this.rm = rm;
		this.nome=nome;
	}
	
	public String getUsuario() {
		if (email.contains("@")) {
			return email.substring(0, email.indexOf("@"));
		}
		return email;
	}
	
	public String getResumo() {
		return 
				"Nome: " + nome + "\n" + 
				"RM: " + rm;
	}
	
	public void setBasico(String nome, int rm) {
		this.nome = nome;
		this.rm=rm;
	}


	public int getRm() {
		return rm;
	}
		
	public void setRm(int rm) {
		this.rm = rm;
	}
	
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	

	
	
	
}
