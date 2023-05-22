package com.ProjetoJava.Dslist.DTO;

import com.ProjetoJava.Dslist.entities.Game;
import com.ProjetoJava.Dslist.projetos.ProjetoGame;

public class GameMinDTO {

	private Long id;
	private String titulo;
	private Integer ano;
	private String imgUrl;
	private String descricaoCurta;

	public GameMinDTO (Game entity) {
		id = entity.getId();
		titulo = entity.getTitulo();
		ano = entity.getAno();
		imgUrl = entity.getImgUrl();
		descricaoCurta = entity.getDescricaoCurta();
	}
	
	public GameMinDTO (ProjetoGame projeto) {
		id = projeto.getId();
		titulo = projeto.getTitulo();
		ano = projeto.getAno();
		imgUrl = projeto.getImgUrl();
		descricaoCurta = projeto.getDescricaoCurta();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getDescricaoCurta() {
		return descricaoCurta;
	}
	
	
	
}
