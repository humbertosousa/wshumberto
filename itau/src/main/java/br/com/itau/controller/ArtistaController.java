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

import br.com.itau.dao.ArtistaDAO;
import br.com.itau.modelo.Artista;

@RestController
@CrossOrigin("*")
public class ArtistaController {

	@Autowired
	private ArtistaDAO dao;
	
	@PostMapping("/apagarartista")
	public ResponseEntity<Boolean> delete(@RequestBody Artista objeto){
		try {
			dao.deleteById(objeto.getId());
			return ResponseEntity.ok(true);
		}catch(Exception e) {
			return ResponseEntity.status(403).build();
			//return ResponseEntity.ok(false);
		}
	}
	
	@GetMapping("/nomeartistico/{nome}")
	public ResponseEntity<List<Artista>> getNomeArtistico(@PathVariable String nome){
		List<Artista> lista = dao.findByNomeArtisticoLike(nome + "%");
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/artista/{cod}")
	public ResponseEntity<Artista> getArtista(@PathVariable int cod){
		Artista resposta = dao.findById(cod).orElse(null);
		if (resposta==null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(resposta);
	}
	
	@GetMapping("/nacionalidade/{nac}")
	public ResponseEntity<List<Artista>> getNacionalidade(@PathVariable String nac){
		List<Artista> lista = dao.findByNacionalidade(nac);
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/artistas")
	public ResponseEntity<List<Artista>> getAll(){
		List<Artista> lista = (List<Artista>) dao.findAll();
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> add(@RequestBody Artista objeto){
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
