package br.com.unixyz.modelo;

public class Curso {

	private String descricao;
	private String sigla;
	private double valor;
	private String formacao;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getFormacao() {
		return formacao;
	}
	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	public Curso(String descricao, String sigla, double valor, String formacao) {
		super();
		this.descricao = descricao;
		this.sigla = sigla;
		this.valor = valor;
		this.formacao = formacao;
	}
	public Curso() {
		super();
	}
	@Override
	public String toString() {
		return "Curso [descricao=" + descricao + ", sigla=" + sigla + ", valor=" + valor + ", formacao=" + formacao
				+ "]";
	}
	
	
	
}
