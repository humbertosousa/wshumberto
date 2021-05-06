package br.com.caicai.teste;

import br.com.caicai.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador elevador = new Elevador();
		elevador.inicializar("Torre B", 20, 0, 8);
		
		System.out.println(elevador.retornarTudo());
		System.out.println(elevador.subir());
		elevador.entrar();
		elevador.entrar();
		elevador.entrar(20);
		System.out.println(elevador.descer());
		elevador.sair();
		System.out.println(elevador.retornarTudo());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
