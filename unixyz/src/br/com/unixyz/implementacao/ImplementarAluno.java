package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Endereco;

public class ImplementarAluno {

	public static void main(String[] args) {	
		Aluno aluno = new Aluno();
	
		aluno.setBasico("REGINA", 12345);
		aluno.setCpf("12345678911");
		aluno.setEmail("regina@itaquera.com.br");
		aluno.setFone("1234-4321");
		
		Endereco endereco = new Endereco();
		endereco.setBairro("ITAQUERA");
		endereco.setCep("12345-123");
		endereco.setCidade("São Paulo");
		endereco.setComplemento("Viela 5");
		endereco.setEstado("SP");
		endereco.setLogradouro("Avenida Itaquera");
		endereco.setNumero("5A");
		
		aluno.setEndereco(endereco);
		//System.out.println(aluno.getNome());
		
		//System.out.println(aluno.toString());
		System.out.println(endereco.getLogradouro());
		
		
		

	}

}
