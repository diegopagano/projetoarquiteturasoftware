package br.com.desafio.springbootapi.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.springbootapi.entity.AdicionarAvaliacaoEntrada;
import br.com.desafio.springbootapi.entity.Avaliacao;
import br.com.desafio.springbootapi.repository.AvaliacaoRepository;

@RestController
public class AdicionarAvaliacaoRest {
	
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;
	
	//exemplo de chamada pode colocar no navegador http://localhost:8080/adicionarAvaliacaoGet?param1=123&param2=ewrwer
	@RequestMapping(value = "/adicionarAvaliacaoGet", params = { "param1", "param2" }, method = RequestMethod.GET, produces = "application/json") // PATH > OQ VAI FAZER
	public String adicionarAvaliacaoGet(@RequestParam("param1") long param1) { // retorna uma lista de todas todos

		return "aqui vai o metodo adicionar avaliacao" + param1;
	}
	
	//
	@RequestMapping(value = "/adicionarAvaliacao", method = RequestMethod.POST, produces = "application/json" ,consumes = "application/json") 
	public String adicionarAvaliacao(@RequestHeader Map<String, String> headers, @RequestBody AdicionarAvaliacaoEntrada entrada) { // retorna uma lista de todas todos
		if(headers.containsKey("idtokenprofessor")) {//eh professor
			Avaliacao avaliacao = new Avaliacao();
			avaliacao.setComentario(entrada.getComentario());
			avaliacao.setIdExercicio(entrada.getIdExercicio());
			avaliacao.setIdProfessor(entrada.getIdProfessor());
			avaliacao.setIdTreino(entrada.getIdTreino());
			avaliacaoRepository.save(avaliacao);
			return "avalicao adicionada:" + avaliacao.getIdAvaliacao();
		}else {
			return "Apenas profesores podem realizar avaliacao.";
		}
	}
}
