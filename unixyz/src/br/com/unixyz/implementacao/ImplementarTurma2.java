package br.com.unixyz.implementacao;

import br.com.unixyz.modelo.Aluno;
import br.com.unixyz.modelo.Curso;
import br.com.unixyz.modelo.Endereco;
import br.com.unixyz.modelo.Professor;
import br.com.unixyz.modelo.Turma;

public class ImplementarTurma2 {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Endereco endaluno = new Endereco();
		Professor professor = new Professor();
		Endereco endprofessor = new Endereco();
		Curso curso = new Curso();
		Turma turma = new Turma();
		
		turma.setAluno(aluno);
		turma.setCodigo(1);
		turma.setCurso(curso);
		turma.setPeriodo("diurno");
		turma.setProfessor(professor);
		turma.setNome("turma18c");
		
		endaluno.setBairro("bairro aluno");
		endaluno.setCep("123456-123");
		// e assim sucessivamente
		
		aluno.setEndereco(endaluno);
		aluno.setNome("Nome do Aluno");
		aluno.setFone("1234-56789");
		// e assim sucessivamente
		
		endprofessor.setBairro("Bairro profe");
		endprofessor.setCidade("sao paulo");
		// e assim sucessivamente
		
		professor.setEndereco(endprofessor);
		professor.setTitulacao("mestre");
		// e assim sucessivamente
		
		curso.setDescricao("descr");
		curso.setValor(5000);
		// e assim sucessivamente
		
		System.out.println(turma.toString());

	}

}
