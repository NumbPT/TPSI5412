package model;

import java.util.ArrayList;

public class Reserva {
	
	ArrayList<Cliente> iCliente;
	
public Reserva(ArrayList<Cliente> iCliente) {
		super();
		this.iCliente = iCliente;
	}

public ArrayList<Cliente> getiCliente() {
	return iCliente;
}

public void setiCliente(ArrayList<Cliente> iCliente) {
	this.iCliente = iCliente;
}



}
	