package com.ProjetoJava.Dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ProjetoJava.Dslist.entities.Game;
import com.ProjetoJava.Dslist.projetos.ProjetoGame;

public interface GameRepository extends JpaRepository<Game, Long>{

	@Query(nativeQuery = true, value = """
			SELECT tb_games.id, tb_games.titulo, tb_games.ano, tb_games.img_url As imgUrl,
			tb_games.descricao_curta AS descricaoCurta, tb_posicao.posicao
			FROM tb_games
			INNER JOIN tb_posicao on tb_games.id =  tb_posicao.game_id
			WHERE tb_posicao.list_id = :idLista
			ORDER BY tb_posicao.posicao """)
	
	List<ProjetoGame> pesquisaPorLista(Long idLista);
	
}
