package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		/*
		 * Tipos primitivos: são os tipos que estão dentro da linguagem
		 * 
		 * boolean = tipo lógico (true/false)
		 * char = 1 caracter (apostrofos) 'a' (char) // "a" (String)
		 * 
		 * byte = -128/+127 
		 * short = -32 mil / +32 mil
		 * int = - 2 trilhoes / + 2 trilhoes
		 * long = 9 quintilhoes
		 * 
		 * float = 
		 * double = possui o dobro de precisao em relação ao float.
		 */
		
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
		float fgts = salario * (float) 0.08; // Ocorre o casting
		int numero = 5;
		byte resultado = (byte) (numero + 2) ; //Ocorre o casting
		/*
		 * Classes Wrappers (São classes que servem para apoiar os
		 * tipos primitivos)
		 * int => Integer
		 * float => Float
		 * boolean => Boolean
		 * double => Double
		 */
		
	}
	
}
