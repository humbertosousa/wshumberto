package br.com.rubinhocar.teste;

import javax.swing.JOptionPane;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		// Exemplo errado - criando o objeto
		// Veiculo objeto2;
		
		//1º Instanciar um objeto
		Veiculo objeto = new Veiculo();
		
		//2º Preencher os dados
		objeto.preencherModelo(JOptionPane.showInputDialog("Modelo"));
		objeto.preencherMontadora(JOptionPane.showInputDialog("Montadora"));
		objeto.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Valor")));
		//3º Exibir os dados
		System.out.println("Modelo: " + objeto.retornarModelo());
		System.out.println("Montadora: " + objeto.retornarMontadora());
		System.out.println("Valor: " + objeto.retornarValor());
		System.out.println("Desconto: " + objeto.retornarDesconto());
		
		Veiculo objeto2 = new Veiculo();
		objeto2.preencherTudo(20000, "UNO", "FIAT");
		System.out.println(objeto2.retornarTudo());
		
		

	}

}
