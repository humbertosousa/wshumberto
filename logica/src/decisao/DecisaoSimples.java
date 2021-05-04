package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		
		String disciplina = JOptionPane.showInputDialog("Disciplina").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1+nota2)/2;
		
		// && => and 		// 	|| => or
		/*
		 * "Você foi reprovado" => media menor que 4
		 * "Você tem chance no exame" => media entre 5.9 e 4
		 */
		
		if(media>=6) {
			System.out.println("Você foi aprovado na disciplina: " + disciplina);
			//somente vai ser executado se a condição for verdadeira
		}
		
		if (media <4) {
			System.out.println("Você foi reprovado na disciplina: " + disciplina);
		}
		
		if (media<6 && media>=4) {
			System.out.println("Você está de exame na disciplina: " + disciplina);
		}
		
		System.out.println("Sua média foi: " + media);

		
		
		
	}

}
