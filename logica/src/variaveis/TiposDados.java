package variaveis;

import javax.swing.JOptionPane;

/*
 * Características do Java:
 * - OO
 * - médio nível
 * - arquitetura hibrida
 */
public class TiposDados {
	// main é o método start point de uma app Java
	public static void main(String[] args) {
		//<Tipo de dado> <nome/identificador> = <valor>;
		String nome = JOptionPane.showInputDialog("Digite o seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog
				("Digite sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog
				("Digite a altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog
				("Digite o peso"));
		double imc = peso / (altura * altura);
		System.out.println("Nome..: " + nome);
		System.out.println("Idade.: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("IMC...: " + imc);
		/*
		 * Tipos De dados:
		 * Numérico: é o dado que PODE ser utilizado em expressões matemáticas
		 * e/ou for um dado crítico para o cenário que se propoe.
		 * CEP (diante de um contexto dos Correios): 00010009 => 1
		 * Telefone (do delivery da pizzaria)
		 * Em Javanês:
		 * - int    => somente para numeros inteiros
		 * - double => para números com casas decimais (números reais)
		 * 
		 * Alfanumérico: é o dado que não está envolvido em operações matemáticas
		 * CEP (do colaborador do Itau para o RH): 00010-009 => 00010-009
		 * Telefone (do cliente do Itau)
		 * - String
		 */



	} // fechando o método

} // fechando a classe


