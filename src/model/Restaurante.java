package model;

import java.util.ArrayList;

public class Restaurante {

	private String nome;
	private String morada;
	private String contacto;
	private String especialidade;
	
	int id;

	public Restaurante(String nome, String morada, String contacto, String especialidade, int id) {
		super();
		this.nome = nome;
		this.morada = morada;
		this.contacto = contacto;
		this.especialidade = especialidade;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMorada() {
		return morada;
	}

	public void setMorada(String morada) {
		this.morada = morada;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
