package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		/*
		 * Sintaxe do "for" � formada por 3 par�metros =>
		 * - variavel que vai contar e o valor que ela vai iniciar
		 * - condi��o (at� quando o la�o vai ser repetido)
		 * - a forma de contagem (se vai ser de 1 em 1, 2 em 2, ......)
		 */
		// numero x contador = resultado
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Tabuada"));
		for (int cont=1;cont<11;cont+=1) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
		}
		
		
		
		

	}

}
