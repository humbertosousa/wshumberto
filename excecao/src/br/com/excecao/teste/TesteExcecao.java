package br.com.excecao.teste;

import javax.swing.JOptionPane;

import br.com.excecao.excecoes.MinhaExcecao;

public class TesteExcecao {
	
	public static void main(String[] args)  {
		// Excecoes Unchecked (DC) = Depois da Compilação
		// Excecoes Checked (AC) = Antes da Compilação
		
		try {
			
			//DriverManager.getConnection("","","");
			//int numero = Integer.parseInt("a");
			//System.out.println("Numero: " + numero);
			
			//String palavra="";
			//System.out.println("Qtde Letras: " + palavra.length());
			/*
			 * Particularidades dos vetores:
			 * - seu tamanho é estático
			 * - os dados são homogeneos
			 * - exige uma variável (indice) para controlar as posições
			 * - não é possível remover uma posição
			 * - ordenação dá trabalho pra fazer
			 */
			String palavras[] = new String[10];
			int indice = 0;
			do {
				palavras[indice] = JOptionPane.showInputDialog("Digite uma palavra");
				indice++;
			}while(JOptionPane.showConfirmDialog
					(null, "Continuar?", "Vetores", JOptionPane.YES_NO_OPTION)==0);
			System.out.println(palavras); // posição de memória
			for (int contador=0;contador<indice;contador++) {
				System.out.println("Palavra nº " + (contador+1) + ": " + palavras[contador]);
			}
			
			
		}catch(Exception e) {
			System.out.println(MinhaExcecao.tratar(e));
		}finally {
			System.out.println("Volte sempre");
			// encerrar banco de dados 
		}
		
		
		
	}
}
