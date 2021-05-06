package br.com.unixyz.modelo;
/*
 * Design Pattern: compilado de padrões de projetos para OO.
 * Um dos padrões é o DTO (Data Transfer Object) cuja função é aplicar
 * boa prática na transição entre o projeto e a programação.
 * Sugestões:
 * 1º TODOS os atributos devem estar como privados.
 * 2º Cada atributo deve possuir um método set e outro método get.
 * 3º ?????
 */

public class Aluno {

	private int rm;
	private String nome;
	private String email;
	private String fone;
	private String cpf;
	
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

	@Override // cenas dos proximos capitulos
	public String toString() {
		return "Aluno [rm=" + rm + ", nome=" + nome + ", email=" + email + ", fone=" + fone + ", cpf=" + cpf + "]";
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
