package repeticao;
/*
 * O Jogador1 ir� digitar um n�mero.
 * Caber� ao Jogador 2 descobrir qual foi o n�mero digitado pelo Jogador1.
 * Primeira Miss�o:
 * - fazer com que a aplica��o pergunte o n�mero para o Jogador 2 enquanto
 * ele n�o acertar o n�mero, e quando acertar exibir a mensagem de Parabens
 * 
 * Segunda Missao:
 * - ap�s o Jogador2 chutar o n�mero voc� deve exibir para ele uma
 * dica, informando se o n�mero digitado pelo Jogador1 � maior ou menor
 * que o n�mero que ele digitou.
 * 
 * Terceira Missao:
 * - Quando o Jogador2 acertar, junto a mensagem de parab�ns dever� exibir
 * quantas tentativas ele utilizou at� acertar o n�mero (dica: ter�
 * que utilizar uma vari�vel para contar)
 */
import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero"));
		int chute=0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe:"));
			contador = contador + 1;
			// contador++;
			// contador+=1;
			if (chute>numero) {
				JOptionPane.showMessageDialog(null, "Chute um n�mero menor");
			}else if (chute<numero) {
				JOptionPane.showMessageDialog(null, "Chute um n�mero maior");
			}
		}while(numero!=chute);
		
		JOptionPane.showMessageDialog
			(null, "Parab�ns voc� acertou com " + contador + " tentativa(s)");
		
		

	}

}
