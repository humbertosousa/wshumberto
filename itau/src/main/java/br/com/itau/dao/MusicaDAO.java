package br.com.itau.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.itau.modelo.Musica;

public interface MusicaDAO extends CrudRepository<Musica, Integer>{

	@Query(value="SELECT COUNT(ID) AS TOTAL FROM TB_MUSICA WHERE LANCAMENTO=1 AND ARTISTA_ID=:num", 
			nativeQuery=true)
	public int findByTotalLancamento(@Param("num") int num);
	
	
	@Query(value="SELECT COUNT(ID) AS TOTAL FROM TB_MUSICA WHERE LANCAMENTO=0 AND ARTISTA_ID=:num", 
			nativeQuery=true)
	public int findByTotalCatalogo(@Param("num") int num);
	
}
