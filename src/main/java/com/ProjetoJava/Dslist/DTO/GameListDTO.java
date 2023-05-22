package com.ProjetoJava.Dslist.DTO;

import com.ProjetoJava.Dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String nome;
	

	public GameListDTO(GameList gameList) {
		id = gameList.getId();
		nome = gameList.getNome();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	
}
