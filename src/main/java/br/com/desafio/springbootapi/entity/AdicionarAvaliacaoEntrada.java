package br.com.desafio.springbootapi.entity;

import java.io.Serializable;

public class AdicionarAvaliacaoEntrada implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer idExercicio;
	
	private Integer idTreino;
	
	private Integer idProfessor;
	
	private String comentario;

	public Integer getIdExercicio() {
		return idExercicio;
	}

	public void setIdExercicio(Integer idExercicio) {
		this.idExercicio = idExercicio;
	}

	public Integer getIdTreino() {
		return idTreino;
	}

	public void setIdTreino(Integer idTreino) {
		this.idTreino = idTreino;
	}

	public Integer getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
}
