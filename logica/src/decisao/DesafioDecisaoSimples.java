package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		
		if (idade<16) {
			System.out.println(nome + " voc� n�o pode votar");
		}
		
		if (idade>=18 && idade<=70) {
			System.out.println(nome + " seu voto � obrigat�rio");
		}
		
		if (idade==16 || idade==17 || idade>70) {
			System.out.println(nome + " seu voto � facultativo");
		}
		/*
		 * Pedir: nome e idade
		 * De acordo com as regras para vota��o no Brasil
		 * oriente o usu�rio se ele pode votar, se ele 
		 * n�o pode votar ou se o voto dele � facultativo.
		 */
		

	}

}
