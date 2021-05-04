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
		 * "Voc� foi reprovado" => media menor que 4
		 * "Voc� tem chance no exame" => media entre 5.9 e 4
		 */
		
		if(media>=6) {
			System.out.println("Voc� foi aprovado na disciplina: " + disciplina);
			//somente vai ser executado se a condi��o for verdadeira
		}
		
		if (media <4) {
			System.out.println("Voc� foi reprovado na disciplina: " + disciplina);
		}
		
		if (media<6 && media>=4) {
			System.out.println("Voc� est� de exame na disciplina: " + disciplina);
		}
		
		System.out.println("Sua m�dia foi: " + media);

		
		
		
	}

}
