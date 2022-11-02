package br.com.desafio.springbootapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgendarAtividadeRest {
	@RequestMapping(value = "/agendarAtividade", method = RequestMethod.GET, produces = "application/json") // PATH > OQ VAI FAZER
	public String agendarAtividade() { // retorna uma lista de todas todos

		return "aqui vai o metodo agendar atividade";
	}
}
