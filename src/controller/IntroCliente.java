package controller;

import java.util.ArrayList;

import model.Cliente;


public class IntroCliente {

	ArrayList<Cliente> iCliente;
	
public IntroCliente() {
	
	this.iCliente = new ArrayList<Cliente>();	
	}

public void Cliente(String nome, String morada, String email, String telefone) {
	
	Cliente c = new Cliente(nome, morada, email, telefone);
	int novoId = iCliente.size();
	
	c.setId(novoId);
	
	iCliente.add(c);	
}

public void iCliente(Cliente c) {
	int novoId = iCliente.size();
	
	c.setId(novoId);
	
	iCliente.add(c);
}

public Cliente getCliente(int id) {

	for (Cliente c : iCliente) {
		
		if (c.getId()==id)
			return c;
	}
	return null;
}



}
