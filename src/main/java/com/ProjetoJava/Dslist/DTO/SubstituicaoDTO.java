package com.ProjetoJava.Dslist.DTO;

//Classe que recebe os dados da requisição do postman

public class SubstituicaoDTO {

	private Integer indiceOrigem;
	private Integer indiceDestino;
	
	public Integer getIndiceOrigem() {
		return indiceOrigem;
	}
	
	public void setIndiceOrigem(Integer indiceOrigem) {
		this.indiceOrigem = indiceOrigem;
	}
	public Integer getIndiceDestino() {
		return indiceDestino;
	}
	public void setIndiceDestino(Integer indiceDestino) {
		this.indiceDestino = indiceDestino;
	}
	
	
}
