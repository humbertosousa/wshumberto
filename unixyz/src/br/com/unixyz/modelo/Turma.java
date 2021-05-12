package br.com.unixyz.modelo;

public class Turma {

	private int codigo;
	private String nome;
	private String periodo;
	private Aluno aluno;
	private Professor professor;
	private Curso curso;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Turma(int codigo, String nome, String periodo, 
			Aluno aluno, Professor professor, Curso curso) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.periodo = periodo;
		this.aluno = aluno;
		this.professor = professor;
		this.curso = curso;
	}
	public Turma() {
		super();
	}
	@Override
	public String toString() {
		return "Turma [codigo=" + codigo + ", nome=" + nome + ", periodo=" + periodo + ", aluno=" + aluno
				+ ", professor=" + professor + ", curso=" + curso + "]";
	}

	
	
	
}
