package com.ProjetoJava.Dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.ProjetoJava.Dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

	@Modifying
	@Query(nativeQuery = true, value = "UPDATE tb_posicao SET posicao = :posicaoNova WHERE list_id = :listId AND game_id = :gameId")
	void atualizarPosicao(Long listId, Long gameId, Integer posicaoNova);
}
