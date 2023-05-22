package com.ProjetoJava.Dslist.DTO;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.ProjetoJava.Dslist.entities.Game;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameDTO {

	private Long id;
	private String titulo;
	private Integer ano;
	private String genero;
	private String plataforma;
	private Double nivel;
	private String imgUrl;
	private String descricaoCurta;
	private String descricaoLonga;
	
	public GameDTO() {
		
	}
	public GameDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public Double getNivel() {
		return nivel;
	}
	public void setNivel(Double nivel) {
		this.nivel = nivel;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getDescricaoCurta() {
		return descricaoCurta;
	}
	public void setDescricaoCurta(String descricaoCurta) {
		this.descricaoCurta = descricaoCurta;
	}
	public String getDescricaoLonga() {
		return descricaoLonga;
	}
	public void setDescricaoLonga(String descricaoLonga) {
		this.descricaoLonga = descricaoLonga;
	}
	
	

}
