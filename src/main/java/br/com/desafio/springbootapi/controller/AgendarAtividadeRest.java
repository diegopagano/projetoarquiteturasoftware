package br.com.desafio.springbootapi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.springbootapi.entity.Agenda;
import br.com.desafio.springbootapi.entity.AgendaEntrada;
import br.com.desafio.springbootapi.repository.AgendaRepositorio;

@RestController
public class AgendarAtividadeRest {
	
	@Autowired
	private AgendaRepositorio agendaRepositorio;
	
	@RequestMapping(value = "/agendarAtividade", method = RequestMethod.GET, produces = "application/json") // PATH > OQ VAI FAZER
	public String agendarAtividade() { // retorna uma lista de todas todos
		return "aqui vai o metodo agendar atividade";
	}
	
	
	@RequestMapping(value = "/agendarAtividade", method = RequestMethod.POST, produces = "application/json" ,consumes = "application/json") 
	public String agendarAtividadePost(@RequestHeader Map<String, String> headers,@RequestBody AgendaEntrada entrada) throws Exception { // retorna uma lista de todas todos
		if(headers.containsKey("idtokenprofessor")) {
			agendarAtividade(entrada);
			return "professor agendou as atividades do aluno.";
		} else if (headers.containsKey("idtoken") && Integer.parseInt(headers.get("idtoken")) == entrada.getIdAluno()) {
			agendarAtividade(entrada);
			return "aluno agendou suas atividades.";
		}
		return "apenas professor ou o proprio aluno podem agendar atividade(s)";
	}
	
	public void agendarAtividade(AgendaEntrada entrada){
		for (Integer idTreino : entrada.getIdtreinos()) {
			Agenda agenda = new Agenda();
			agenda.setIdTreino(idTreino);
			agenda.setIdAluno(entrada.getIdAluno());
			agendaRepositorio.save(agenda);
		}
	}
}
