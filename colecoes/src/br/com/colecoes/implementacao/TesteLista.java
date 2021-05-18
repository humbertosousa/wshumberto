package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class TesteLista {
/*
 * Características da Collection List
 * - tamanho é dinâmico
 * - não há necessidade de qualquer recurso para controlar o indice
 * - os dados podem ser heterogeneos
 * - podemos eliminar posições em execução
 */
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>(); // lista Generics
		do{
			lista.add(JOptionPane.showInputDialog("Digite um cargo"));
		}while(JOptionPane.showConfirmDialog(null, "?","",JOptionPane.YES_NO_OPTION)==0);
		
		System.out.println(lista);
		//lista.add(7);
		//lista.add(true);
		//lista.add('a');
		System.out.println("Primeiro: " + lista.get(0)); // exibindo o primeiro da lista
		lista.remove(0); // removendo o primeiro elemento
		System.out.println("Depois de remover: " + lista);
		Collections.sort(lista);
		System.out.println("Ordenada: " + lista);
		for (int contador=0;contador<lista.size();contador++) {
			System.out.println("Cargo: " + lista.get(contador));
		}
		
		
	}
}
