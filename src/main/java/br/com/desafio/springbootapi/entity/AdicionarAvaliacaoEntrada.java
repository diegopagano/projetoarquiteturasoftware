package br.com.desafio.springbootapi.entity;

import java.io.Serializable;

public class AdicionarAvaliacaoEntrada implements Serializable{

	private static final long serialVersionUID = 1L;
	private String valor1;
	private String valor2;
	private Integer valor3;
	public String getValor1() {
		return valor1;
	}
	public void setValor1(String valor1) {
		this.valor1 = valor1;
	}
	public String getValor2() {
		return valor2;
	}
	public void setValor2(String valor2) {
		this.valor2 = valor2;
	}
	public Integer getValor3() {
		return valor3;
	}
	public void setValor3(Integer valor3) {
		this.valor3 = valor3;
	}
	
	
}
