package variaveis;

import javax.swing.JOptionPane;

/*
 * Sobre Identificadores (nomes que voc� utiliza dentro da programa��o)
 * Regras:
 * 1�-) N�o come�ar�s com n�meros. 1berto (errado) h1berto (certo)
 * 2�-) N�o utilizar�s palavras reservadas. N�o pode: if, double, int, class
 * 3�-) N�o far�s uso de caracteres especiais. n@me, d@t@, tr#s. 
 * 
 * Padr�es:
 * - UML : Padr�o para OO
 * 		- Classes devem come�ar com letras maiusculas
 * 		- Variaveis come�am com letras minusculas (substantivos)
 * 		- M�todos come�am com letras minusculas, verbos e s�o seguidos de parenteses
 * - CamelCase : maiusculas e minusculas
 *       - da segunda palavra em diante, todas as palavras devem iniciar
 *       	com letra maiuscula.
 * - utilize nomes significativos      
 */
public class TiposDadosDesafio {

	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Nome do Produto");
		double valorCompra = Double.parseDouble
				(JOptionPane.showInputDialog("Valor de Compra"));
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
		double valorVenda = valorCompra * 1.2;
		double totalVenda = valorVenda * qtde;
		double impostos = totalVenda * 0.22;
		System.out.println("Produto: " + produto);
		System.out.println("Valor Venda: " + valorVenda);
		System.out.println("Total (- Impostos): " + (totalVenda-impostos));
		
		/*
		 * Java ME (Micro Edition): para dispositivos que n�o cont�m SO
		 * Java SE (Standard Edition): para aplica��es stand alone (local)
		 * Java EE (Enterprise Edition): para aplica��es WEB. 
		 */
		/*
		 * Capturem: o nome de um produto, o valor
		 * de compra, e a qtde.
		 * Sobre o valor de compra considerem um lucro de
		 * 20% para obter o valor de venda
		 * Calcule o total considerando o valor de venda e qtde
		 * Sobre o total acima calcule 22% de impostos
		 * No final exiba:
		 * O nome do produto
		 * O valor de venda
		 * O Total sem impostos
		 */
		
		
		
		
		
		
		
		
		
	}
	
}
