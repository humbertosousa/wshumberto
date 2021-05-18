package br.com.urnaeletronica.beans;

public class VotoReduzido {

	private String candidato;
	private int titulo;
	public String getCandidato() {
		return candidato;
	}
	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}
	public int getTitulo() {
		return titulo;
	}
	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	public VotoReduzido(String candidato, int titulo) {
		super();
		this.candidato = candidato;
		this.titulo = titulo;
	}
	public VotoReduzido() {
		super();
	}
	@Override
	public String toString() {
		return "VotoReduzido [candidato=" + candidato + ", titulo=" + titulo + "]";
	}
	
	
}
