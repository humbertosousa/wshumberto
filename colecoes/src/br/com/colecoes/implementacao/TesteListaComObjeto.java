package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListaComObjeto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		
		lista.add(new Cargo("DBA", "JR", 5000));
		lista.add(new Cargo("DEV", "JR", 4000));
		lista.add(new Cargo("Gerente de Projetos", "JR", 4500));
		lista.add(new Cargo("DBA", "SR", 15000));
		
		System.out.println("Completa: " + lista);
		
		double total = 0;
		double totalDBA=0;
		int qtdeJr=0;
		Cargo resposta = new Cargo();
		for (Cargo objeto : lista) {
			System.out.println("Cargo: " + objeto.getNome());
			System.out.println("Nível: " + objeto.getNivel());
			System.out.println("Salario: " + objeto.getSalario());
			System.out.println("=============================");
			total+=objeto.getSalario();
			if (objeto.getNome().equals("DBA")) {
				totalDBA+=objeto.getSalario();
			}
			if (objeto.getNivel().equalsIgnoreCase("JR")) {
				qtdeJr++;
			}
			if (objeto.getSalario()>resposta.getSalario()) {
				resposta=objeto;
			}		
		}
		System.out.println("Total: " + total);
		System.out.println("Média: " + (total/lista.size()));
		System.out.println("Total DBA: " + totalDBA);
		System.out.println("Qtde Jrs: " + qtdeJr);
		System.out.println("Cargo com maior salario: " + resposta);
		/*
		 * Requisição:
		 * - exibir o total de salario
		 * - média dos salários
		 * - o total dos DBA´s
		 * - a quantidade de cargos nível junior
		 * - o nome do cargo e o nível que possui o maior salario
		 */
		

	}

}
