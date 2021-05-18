package br.com.urnaeletronica.beans;

import java.util.List;

public class Urna {

	private int zona;
	private int secao;
	private List<Voto> votos;
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	public int getSecao() {
		return secao;
	}
	public void setSecao(int secao) {
		this.secao = secao;
	}
	public List<Voto> getVotos() {
		return votos;
	}
	public void setVotos(List<Voto> votos) {
		this.votos = votos;
	}
	public Urna(int zona, int secao, List<Voto> votos) {
		super();
		this.zona = zona;
		this.secao = secao;
		this.votos = votos;
	}
	public Urna() {
		super();
	}
	@Override
	public String toString() {
		return "Urna [zona=" + zona + ", secao=" + secao + ", votos=" + votos + "]";
	}
	
	
	
	
}
