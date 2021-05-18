package br.com.excecao.teste;

import javax.swing.JOptionPane;

import br.com.excecao.excecoes.MinhaExcecao;

public class TesteExcecao {
	
	public static void main(String[] args)  {
		// Excecoes Unchecked (DC) = Depois da Compila��o
		// Excecoes Checked (AC) = Antes da Compila��o
		
		try {
			
			//DriverManager.getConnection("","","");
			//int numero = Integer.parseInt("a");
			//System.out.println("Numero: " + numero);
			
			//String palavra="";
			//System.out.println("Qtde Letras: " + palavra.length());
			/*
			 * Particularidades dos vetores:
			 * - seu tamanho � est�tico
			 * - os dados s�o homogeneos
			 * - exige uma vari�vel (indice) para controlar as posi��es
			 * - n�o � poss�vel remover uma posi��o
			 * - ordena��o d� trabalho pra fazer
			 */
			String palavras[] = new String[10];
			int indice = 0;
			do {
				palavras[indice] = JOptionPane.showInputDialog("Digite uma palavra");
				indice++;
			}while(JOptionPane.showConfirmDialog
					(null, "Continuar?", "Vetores", JOptionPane.YES_NO_OPTION)==0);
			System.out.println(palavras); // posi��o de mem�ria
			for (int contador=0;contador<indice;contador++) {
				System.out.println("Palavra n� " + (contador+1) + ": " + palavras[contador]);
			}
			
			
		}catch(Exception e) {
			System.out.println(MinhaExcecao.tratar(e));
		}finally {
			System.out.println("Volte sempre");
			// encerrar banco de dados 
		}
		
		
		
	}
}
