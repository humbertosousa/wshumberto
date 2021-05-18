package br.com.urnaeletronica.beans;

public class Voto {

	private int titulo;
	private String candidato;
	private String cargo;
	private byte turno;
	public int getTitulo() {
		return titulo;
	}
	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	public String getCandidato() {
		return candidato;
	}
	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public byte getTurno() {
		return turno;
	}
	public void setTurno(byte turno) {
		this.turno = turno;
	}
	public Voto(int titulo, String candidato, String cargo, byte turno) {
		super();
		this.titulo = titulo;
		this.candidato = candidato;
		this.cargo = cargo;
		this.turno = turno;
	}
	public Voto() {
		super();
	}
	@Override
	public String toString() {
		return "Voto [titulo=" + titulo + ", candidato=" + candidato + ", cargo=" + cargo + ", turno=" + turno + "]";
	}
	
	
	
}
