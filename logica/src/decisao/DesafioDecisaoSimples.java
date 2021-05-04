package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		
		if (idade<16) {
			System.out.println(nome + " você não pode votar");
		}
		
		if (idade>=18 && idade<=70) {
			System.out.println(nome + " seu voto é obrigatório");
		}
		
		if (idade==16 || idade==17 || idade>70) {
			System.out.println(nome + " seu voto é facultativo");
		}
		/*
		 * Pedir: nome e idade
		 * De acordo com as regras para votação no Brasil
		 * oriente o usuário se ele pode votar, se ele 
		 * não pode votar ou se o voto dele é facultativo.
		 */
		

	}

}
