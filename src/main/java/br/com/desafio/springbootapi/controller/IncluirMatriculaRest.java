package br.com.desafio.springbootapi.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.springbootapi.entity.Aluno;
import br.com.desafio.springbootapi.entity.IncluirMatriculaEntrada;
import br.com.desafio.springbootapi.entity.Usuario;
import br.com.desafio.springbootapi.repository.AlunoRepositorio;
import br.com.desafio.springbootapi.repository.UsuarioRepositorio;

@RestController
public class IncluirMatriculaRest {
	
    @Autowired
    private AlunoRepositorio alunoRepositorio;
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    private String formato = "yyyyMMdd";
    
	@RequestMapping(value = "/incluirMatricula", method = RequestMethod.GET, produces = "application/json") // PATH > OQ VAI FAZER
	public String incluirMatricula() { // retorna uma lista de todas todos

		return "aqui vai o metodo incluir matricula";
	}
	
	@RequestMapping(value = "/incluirMatricula", method = RequestMethod.POST, produces = "application/json" ,consumes = "application/json") 
	public String incluirMatriculaPost(@RequestBody IncluirMatriculaEntrada entrada) throws Exception { // retorna uma lista de todas todos

		Usuario usuario = new Usuario();
		usuario.setCpf(entrada.getCpf());
		usuario.setNome(entrada.getNome());
		
		usuario = usuarioRepositorio.save(usuario);
		
		Aluno aluno = new Aluno();
		aluno.setIdUsuario(usuario.getIdUsuario());
		aluno.setObservacoes(entrada.getObservacoes());
		if(StringUtils.isNotBlank(entrada.getDataMatricula())){
			SimpleDateFormat format = new SimpleDateFormat(formato);
			try {
				aluno.setDataMatricula(format.parse(entrada.getDataMatricula()));
			} catch (ParseException e) {
				throw new Exception("Formato da data passado deve ser no formato: " + formato);
			}
		} else {
			aluno.setDataMatricula(new Date());

		}
		aluno.setValorMatricula(entrada.getValorMatricula());
		
		alunoRepositorio.save(aluno);
		return "Matricula do usuario incluida." + usuario.getIdUsuario();
	}
}
