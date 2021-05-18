package br.com.itau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.dao.UsuarioDAO;
import br.com.itau.modelo.Usuario;

@RestController // para indicar ao Spring que esta classe irá responder métodos do HTTP
@CrossOrigin("*") // para liberar o acesso fora do servidor à estes recursos
public class UsuarioController {
	
	@Autowired // delega para o Spring o gerenciamento deste atributo
	private UsuarioDAO dao;
	
	
	@GetMapping("/userget/{cod}")
	public Usuario getUserGet(@PathVariable int cod) {
		Usuario resposta = dao.findById(cod).orElse(new Usuario());
		resposta.setSenha("");
		return resposta;
	}
	
	@PostMapping("/userpost")
	public Usuario getUserPost(@RequestBody Usuario objeto) {
		Usuario resposta= dao.findById(objeto.getId()).orElse(new Usuario());
		resposta.setSenha("");
		return resposta;
		
	}
	
	
	@PostMapping("/novousuario")
	public Usuario add(@RequestBody Usuario objeto) {
		dao.save(objeto);
		return objeto;
	}
	
	@GetMapping("/users")
	public List<Usuario> getAll(){
		List<Usuario> lista = (List<Usuario>) dao.findAll();
		return lista;
	}
	
	
	
}
