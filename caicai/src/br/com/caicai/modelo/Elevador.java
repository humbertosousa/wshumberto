package br.com.caicai.modelo;

public class Elevador {

	private String nome;
	private int andarMaximo;
	private int andarMinimo;
	private int capacidadePessoas;
	private int andarAtual;
	private int qtdePessoas;
	
	public void entrar(int pQtde) {
		int resultado = pQtde + qtdePessoas;
		if (resultado<=capacidadePessoas) {
			qtdePessoas+=pQtde;
		}
	}
	
	public void entrar() {
		if (qtdePessoas<capacidadePessoas) {
			qtdePessoas++;
		}
	}
	
	public void sair() {
		if (qtdePessoas>0) {
			qtdePessoas--;
		}
	}
	
	public String descer() {
		if (andarAtual>andarMinimo) {
			andarAtual--;
			return "Descendo...";
		}
		return "Não pode descer";
	}
	
	public String subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
			return "Subindo...";
		}
		return "Não pode subir";
		
	}
	
	public String retornarTudo() {
		return
				"Nome.........: " + nome + "\n" +
				"Andar Máximo.: " + andarMaximo + "\n" + 
				"Andar Minimo.: " + andarMinimo + "\n" + 
				"Capacidade...: " + capacidadePessoas + "\n" + 
				"Andar Atual..: " + andarAtual + "\n" + 
				"Qtde Pessoas.: " + qtdePessoas;
	}
	
	public void inicializar(String pNome, int pAndarMax, int pAndarMin, int capPessoas) {
		nome = pNome;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = capPessoas;	
	}
	
	
	
	
}
