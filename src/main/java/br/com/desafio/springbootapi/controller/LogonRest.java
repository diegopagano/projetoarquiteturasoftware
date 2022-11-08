package br.com.desafio.springbootapi.controller;

import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.springbootapi.entity.Usuario;
import br.com.desafio.springbootapi.repository.UsuarioRepositorio;

@RestController
public class LogonRest {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@RequestMapping(value = "/logonRest/{id}/{senha}", method = RequestMethod.GET, produces = "application/json") // PATH > OQ VAI FAZER
	public String cancelarAtividade(@PathVariable(value = "id") Integer id,@PathVariable(value = "senha") String senha) { // retorna uma lista de todas todos
		Optional<Usuario> usuarioOpt = usuarioRepositorio.findById(id);
		Usuario user = usuarioOpt.get();
		if(StringUtils.equalsIgnoreCase(user.getSenha(),senha)) {
		return "idToken:"+user.getIdUsuario();
		}
		return "logon não autorizado";
	}
}
