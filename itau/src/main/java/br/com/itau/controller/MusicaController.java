package br.com.itau.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.dao.MusicaDAO;
import br.com.itau.modelo.Musica;

@RestController
@CrossOrigin("*")
public class MusicaController {

	@Autowired
	private MusicaDAO dao;

	@GetMapping("/catalogo/{codartista}")
	public ResponseEntity<Integer> getTotalCatalogo(@PathVariable int codartista){
		return ResponseEntity.ok(dao.findByTotalCatalogo(codartista));
	}

	
	@GetMapping("/lancamento/{codartista}")
	public ResponseEntity<Integer> getTotalLancamento(@PathVariable int codartista){
		return ResponseEntity.ok(dao.findByTotalLancamento(codartista));
	}
	
	@GetMapping("/musicas")
	public ResponseEntity<List<Musica>> getMusicas(){
		List<Musica> lista = (List<Musica>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping("/novamusica")
	public ResponseEntity<Musica> add(@RequestBody Musica objeto){
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
