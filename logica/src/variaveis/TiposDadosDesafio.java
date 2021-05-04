package variaveis;

import javax.swing.JOptionPane;

/*
 * Sobre Identificadores (nomes que você utiliza dentro da programação)
 * Regras:
 * 1º-) Não começarás com números. 1berto (errado) h1berto (certo)
 * 2º-) Não utilizarás palavras reservadas. Não pode: if, double, int, class
 * 3º-) Não farás uso de caracteres especiais. n@me, d@t@, tr#s. 
 * 
 * Padrões:
 * - UML : Padrão para OO
 * 		- Classes devem começar com letras maiusculas
 * 		- Variaveis começam com letras minusculas (substantivos)
 * 		- Métodos começam com letras minusculas, verbos e são seguidos de parenteses
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
		 * Java ME (Micro Edition): para dispositivos que não contém SO
		 * Java SE (Standard Edition): para aplicações stand alone (local)
		 * Java EE (Enterprise Edition): para aplicações WEB. 
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
