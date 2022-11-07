package br.com.desafio.springbootapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.springbootapi.repository.AgendaRepositorio;

@RestController
public class CancelarAtividadeRest {
	
	@Autowired
	private AgendaRepositorio agendaRepositorio;
	
	@RequestMapping(value = "/cancelarAtividade/{id}", method = RequestMethod.GET, produces = "application/json") // PATH > OQ VAI FAZER
	public String cancelarAtividade(@PathVariable(value = "id") Integer id) { // retorna uma lista de todas todos
		agendaRepositorio.deleteById(id);
		return "atividade cancelada";
	}
}
