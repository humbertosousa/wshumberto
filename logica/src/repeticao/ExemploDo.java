package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {

		do {
			float salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Sal�rio"));
			float valorExtras = Float.parseFloat(JOptionPane.showInputDialog("Valor Extras"));
			float fgts = (salarioBruto+valorExtras) * (float) 0.08;
			System.out.println("Salario Bruto: " + (salarioBruto+valorExtras));
			System.out.println("FGTS: " + fgts);
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "T�tulo", JOptionPane.YES_NO_OPTION)==0);

		/*
		int resp=0;
		while(resp==0) {
			float salarioBruto = Float.parseFloat(JOptionPane.showInputDialog("Sal�rio"));
			float valorExtras = Float.parseFloat(JOptionPane.showInputDialog("Valor Extras"));
			float fgts = (salarioBruto+valorExtras) * (float) 0.08;
			System.out.println("Salario Bruto: " + (salarioBruto+valorExtras));
			System.out.println("FGTS: " + fgts);
			resp=JOptionPane.showConfirmDialog(null, "Continuar?", "T�tulo", JOptionPane.YES_NO_OPTION);
		}*/
		




	}

}
