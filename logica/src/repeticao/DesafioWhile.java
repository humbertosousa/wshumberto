package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		
		/*
		 * Capturar: dia, mes e ano em variaveis diferentes 
		 * Valide o dia para que ele esteja entre 1 e 30 ou 1 e 31 ou 1 e 29
 		 * Valide o mes para que esteja entre 1 e 12
 		 * Valide o ano para que seja menor 2003 e maior que 1952.
 		 * 
 		 * No final exibam a data completa
		 */
		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Dia: "));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Mes"));
		short ano = Short.parseShort(JOptionPane.showInputDialog("Ano"));
		
		while(ano>=2003 || ano<=1952) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Ano novamente"));
		}
		
		while (mes<1 || mes>12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Mes novamente"));
		}
		
		if (mes==2) {
			while(dia<1 || dia>29) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia novamente: "));
			}
		}else if (mes==4 || mes==6 || mes==9 || mes==11) { //meses com 30 dias
			while(dia<1 || dia>30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia novamente: "));
			}
		}else { // meses com 31 dias
			while(dia<1 || dia>31) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia novamente: "));
			}
		}
		
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
