package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<String>();
		lista.add("DEV");
		lista.add("Analista");
		lista.add("Gerente de Projetos");
		lista.add("DBA");
		lista.add("DBA");
		System.out.println("Completa: " + lista);
		//System.out.println("Primeiro elemento: " + lista.get(0));
		//Collections.sort(lista);
		// Não utilizamos o for convencional com o Set
		/*
		for (int contador=0; contador<lista.size();contador++) {
			System.out.println("Cargo: " + lista.get(contador));
		}*/
		// Para Set o ideal é o foreach
		for (String cargo : lista) {
			System.out.println("Cargo: " + cargo);
		}
		
		
		

	}

}
