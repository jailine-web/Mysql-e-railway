package com.ProjetoJava.Dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoJava.Dslist.DTO.GameDTO;
import com.ProjetoJava.Dslist.DTO.GameMinDTO;
import com.ProjetoJava.Dslist.services.GameService;

@RestController // disponibiliza a API
@RequestMapping(value="/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> buscarGames(){
		List<GameMinDTO> games = gameService.buscarTodosOsGames();
		return games;
	}
	
	@GetMapping(value ="/{id}")
	public GameDTO buscarGamePorId(@PathVariable Long id){
		GameDTO resultado = gameService.buscarPorId(id);
		return resultado;
	}
	
}
