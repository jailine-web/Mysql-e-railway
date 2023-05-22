package com.ProjetoJava.Dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ProjetoJava.Dslist.DTO.GameListDTO;
import com.ProjetoJava.Dslist.entities.GameList;
import com.ProjetoJava.Dslist.projetos.ProjetoGame;
import com.ProjetoJava.Dslist.repositories.GameListRepository;
import com.ProjetoJava.Dslist.repositories.GameRepository;

@Service 
public class GameListService {

	@Autowired 
	private GameListRepository gameListRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> buscarTodosOsGames(){
		List<GameList> listaGames = gameListRepository.findAll();
		return listaGames.stream().map(x -> new GameListDTO(x)).toList();
		
	}
	
	@Transactional
	public void moverFilme(Long idList, int indiceOrigem, int indiceDestino) {
		List<ProjetoGame> lista = gameRepository.pesquisaPorLista(idList);
		
		ProjetoGame obj = lista.remove(indiceOrigem);
		lista.add(indiceDestino,obj);
		
		int min = indiceOrigem < indiceDestino ? indiceOrigem : indiceDestino;
		int max = indiceOrigem < indiceDestino ? indiceDestino : indiceOrigem;
		
		for(int i = min; i<= max; i++) {
			gameListRepository.atualizarPosicao(idList, lista.get(i).getId(), i);
		}
		
	}
	
}
