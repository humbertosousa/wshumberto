package repeticao;

import javax.swing.JOptionPane;

/*
Ao terminar, a aplicação deverá exibir:
- a pessoa mais experiente (nome e idade)
- a pessoa mais jovem (nome e idade)
 */
public class Slide77Exercicio4 {

	public static void main(String[] args) {
		int maioresIdade=0;
		int qtdePessoas=0;
		int totalIdades=0;
		String nomeExperiente="";
		short idadeExperiente=0;
		String nomeJovem="";
		short idadeJovem=0;
		do {
			String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
			short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
			if (idade<idadeJovem || qtdePessoas==0) {
				idadeJovem=idade;
				nomeJovem=nome;				
			}
			if (idade>idadeExperiente) {
				idadeExperiente=idade;
				nomeExperiente=nome;
			}
			//totalIdades= totalIdades + idade;
			totalIdades+=idade;
			qtdePessoas++;
			if (idade>=18) {
				maioresIdade++;
			}
		}while(JOptionPane.showConfirmDialog(null, "?","Title", JOptionPane.YES_NO_OPTION)==0);
		
		JOptionPane.showMessageDialog(null, "Maiores: " + maioresIdade);
		JOptionPane.showMessageDialog(null, "Média: " + (totalIdades/qtdePessoas));
		JOptionPane.showMessageDialog(null, "A pessoa mais experiente é: " 
				+ nomeExperiente + " com " + idadeExperiente + " anos.");
		JOptionPane.showMessageDialog(null, "A pessoa mais jovem é: " 
				+ nomeJovem + " com " + idadeJovem + " anos.");
		
		
		
		

	}

}
