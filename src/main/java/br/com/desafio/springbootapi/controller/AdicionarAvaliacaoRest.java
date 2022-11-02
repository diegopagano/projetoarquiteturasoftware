package br.com.desafio.springbootapi.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.springbootapi.entity.AdicionarAvaliacaoEntrada;

@RestController
public class AdicionarAvaliacaoRest {
	//exemplo de chamada pode colocar no navegador http://localhost:8080/adicionarAvaliacaoGet?param1=123&param2=ewrwer
	@RequestMapping(value = "/adicionarAvaliacaoGet", params = { "param1", "param2" }, method = RequestMethod.GET, produces = "application/json") // PATH > OQ VAI FAZER
	public String adicionarAvaliacaoGet(@RequestParam("param1") long param1) { // retorna uma lista de todas todos

		return "aqui vai o metodo adicionar avaliacao" + param1;
	}
	
	//
	@RequestMapping(value = "/adicionarAvaliacaoPost", method = RequestMethod.POST, produces = "application/json" ,consumes = "application/json") 
	public String adicionarAvaliacaoPost(@RequestBody AdicionarAvaliacaoEntrada entrada) { // retorna uma lista de todas todos

		return "aqui vai o metodo adicionar avaliacao";
	}
}
