package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
		char operacao = JOptionPane.showInputDialog
			("Digite:\n<+> Somar\n<-> Subtrair\n<*> Multiplicar\n</> Dividir").charAt(0);
		int resultado=0;
		if (operacao=='+') {
			resultado=valor1+valor2;
		}else if (operacao=='-') {
			resultado=valor1-valor2;
		}else if (operacao=='*') {
			resultado=valor1*valor2;
		}else if (operacao=='/') {
			resultado=valor1/valor2;
		}else {
			System.out.println("Opção inválida");
		}
		System.out.println("Resultado: " + resultado);
		
		
		
		
		
	}

}
