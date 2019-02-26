package com.stackoverflow.solution;

import java.util.List;

public class Mesa {
    private int numero;
    private List<Conta> contas;
    
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
