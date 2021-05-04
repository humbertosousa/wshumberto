package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	
	public static void main(String[] args) {
		
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Diarias"));
		float taxa = (float) 5.5;
		if (diarias==15) {
			taxa = 6;
		}else if (diarias<15) {
			taxa = 8;
		}
		System.out.println("Total: " + ((80 + taxa) * diarias));
		/*
		short diarias2 = Short.parseShort(JOptionPane.showInputDialog("Diarias"));
		float valorDiaria = (float) 85.5;
		if (diarias2==15) {
			valorDiaria = 86;
		}else if (diarias2<15) {
			valorDiaria = 88;
		}
		System.out.println("Total: " + (valorDiaria * diarias));
		*/
		
		
	}
}
