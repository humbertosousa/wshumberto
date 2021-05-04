package variaveis;

public class ManipulaString {

	public static void main(String[] args) {
		
		String email = "humBeRtO@fiap.COM.br";
		System.out.println("Original: " + email);
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Qtde de Caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posição do @: " + email.indexOf("@"));
		System.out.println("Do 3º até o 5º: " + email.substring(2,5));
		System.out.println("Do 3º até o fim: " + email.substring(2));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Usuario: " + email.substring(0,email.indexOf("@")).toLowerCase());
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1).toLowerCase());
		System.out.println("Primeiro Caracter: " + email.charAt(0));
		System.out.println(email=="humBeRtO@fiap.COM.br"); // errado
		System.out.println("É igual? " + email.equals("humBeRtO@fiap.COM.br"));
		//     h u m b e r t o @ f i a 
		//(-1) 0 1 2 3 4 5 6 7 8 9 ...
		
		
		
		
		/*
		 * churros => variavel
		 * churros() => função
		 * Abc.churros() => método
		 * Churros => classe
		 */
	}
	
}
