package repeticao;
/*
 * O Jogador1 irá digitar um número.
 * Caberá ao Jogador 2 descobrir qual foi o número digitado pelo Jogador1.
 * Primeira Missão:
 * - fazer com que a aplicação pergunte o número para o Jogador 2 enquanto
 * ele não acertar o número, e quando acertar exibir a mensagem de Parabens
 * 
 * Segunda Missao:
 * - após o Jogador2 chutar o número você deve exibir para ele uma
 * dica, informando se o número digitado pelo Jogador1 é maior ou menor
 * que o número que ele digitou.
 * 
 * Terceira Missao:
 * - Quando o Jogador2 acertar, junto a mensagem de parabéns deverá exibir
 * quantas tentativas ele utilizou até acertar o número (dica: terá
 * que utilizar uma variável para contar)
 */
import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Número"));
		int chute=0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe:"));
			contador = contador + 1;
			// contador++;
			// contador+=1;
			if (chute>numero) {
				JOptionPane.showMessageDialog(null, "Chute um número menor");
			}else if (chute<numero) {
				JOptionPane.showMessageDialog(null, "Chute um número maior");
			}
		}while(numero!=chute);
		
		JOptionPane.showMessageDialog
			(null, "Parabéns você acertou com " + contador + " tentativa(s)");
		
		

	}

}
