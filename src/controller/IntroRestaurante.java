package controller;

import java.util.ArrayList;

import model.Restaurante;

public class IntroRestaurante {

	ArrayList<Restaurante>iRestaurante;
	
	public IntroRestaurante() {
		
		this.iRestaurante = new ArrayList<Restaurante>();	
		}

	public void Restaurante(String nome, String morada, String contacto, String especialidade) {
		
		Restaurante r = new Restaurante(nome, morada, contacto, especialidade);
		int novoId = iRestaurante.size();
		
		r.setId(novoId);
		
		iRestaurante.add(r);	
	}

	public void iRestaurante(Restaurante r) {
		int novoId = iRestaurante.size();
		
		r.setId(novoId);
		
		iRestaurante.add(r);
	}

	public Restaurante getRestaurante(int id) {

		for (Restaurante r : iRestaurante) {
			
			if (r.getId()==id)
				return r;
		}
		return null;
	}



	}