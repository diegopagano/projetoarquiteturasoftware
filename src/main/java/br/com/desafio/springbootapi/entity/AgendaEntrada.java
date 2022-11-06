package br.com.desafio.springbootapi.entity;

import java.io.Serializable;
import java.util.List;

public class AgendaEntrada implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer idAluno;
	
	private List<Integer> idtreinos;

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public List<Integer> getIdtreinos() {
		return idtreinos;
	}

	public void setIdtreinos(List<Integer> idtreinos) {
		this.idtreinos = idtreinos;
	}
	
}
