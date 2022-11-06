package br.com.desafio.springbootapi.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "treino")
public class Treino implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idTreino;
	
	private Integer idProfessor;
	
	private String horarrio;
	
	private Date data;
	
	private String descricao;

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

	public String getHorarrio() {
		return horarrio;
	}

	public void setHorarrio(String horarrio) {
		this.horarrio = horarrio;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
