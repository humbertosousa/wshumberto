package br.com.itau.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.modelo.Usuario;

/*
 * DAO => é um pattern que sugestiona onde devem ficar os comandos SQL DML.
 * Dentro das classes DAO´s:
 * Deve montar o CRUD (Create - Read - Update - Delete)
 * 
 */

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{

	public Usuario findByEmailAndSenha(String email, String senha);
	/*
 * CrudRepository será a classe pai do UsuarioDAO e está informando ao Spring
 * que esta classe armazenará o CRUD para usuario. O Integer é para especificar
 * que o tipo de dado da chave primária é Integer.
 */
	/*
	 * Métodos herdados do CrudRepository:
	 * - save (objeto): grava/altera uma linha no banco de dados 
	 * - findById(int): pesquisa um usuário pelo código
	 * - findAll(): retorna todos os usuários
	 * - deleteById(int): apaga um usuário pelo código
	 * - deleteAll(): apaga tudo
	 * - count() : retorna qtos usuários existem
	 */
	
	
	
}
