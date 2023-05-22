package com.ProjetoJava.Dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_posicao")
public class Posicao {

	@EmbeddedId
	private PosicaoPK chaveComposta = new PosicaoPK(); //representa dois campos na tabela relacional
	
	private Integer posicao;
	
	public Posicao() {
		
	}

	public Posicao(Game game, GameList gameList, Integer posicao) {
		chaveComposta.setGame(game);
		chaveComposta.setGameList(gameList);
		this.posicao = posicao;
	}

	public PosicaoPK getChaveComposta() {
		return chaveComposta;
	}

	public void setChaveComposta(PosicaoPK chaveComposta) {
		this.chaveComposta = chaveComposta;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chaveComposta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicao other = (Posicao) obj;
		return Objects.equals(chaveComposta, other.chaveComposta);
	}
	
	
}
