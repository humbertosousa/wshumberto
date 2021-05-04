package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		/*
		 * Solicitem as faltas
		 * Para que o aluno esteja aprovado ele precisa ter 
		 * a qtde de faltas menor que 20 e a nota maior ou igual a 6
		 * (Vale para o exame tb)
		 */

		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));
		String disciplina = JOptionPane.showInputDialog("Disciplina").toUpperCase();

		if (faltas<20) {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
			float media = (nota1+nota2)/2;
			if(media>=6) {
				System.out.println("Você foi aprovado na disciplina: " + disciplina);
			}

			else if (media <4) {
				System.out.println("Você foi reprovado na disciplina: " + disciplina);
			}

			else  {
				System.out.println("Você está de exame na disciplina: " + disciplina);
			}

			System.out.println("Sua média foi: " + media);
		}else {
			System.out.println("Você foi reprovado por faltas.");
		}



	}

}
