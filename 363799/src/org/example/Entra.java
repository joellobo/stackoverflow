package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Entra extends Fluxo {
	private int periodo;
	private boolean fixo;
	public List<String> prods = new ArrayList<>();
	public List<Entra> entra = new ArrayList<>();

	public Entra(Date data, double valor, String desc, int periodo, List<String> prods, boolean fixo) {
		super(data, valor, desc);
		this.periodo = periodo;
		this.prods = prods;
	}

	public int getPeriodo() {
		return periodo;
	}

	public boolean isFixo() {
		return fixo;
	}

	public List<String> getProds() {
		return prods;
	}

	public List<Entra> getEntra() {
		return entra;
	}

	public void setProds(List<String> prods) {
		this.prods = prods;
	}

	public void setEntra(List<Entra> entra) {
		this.entra = entra;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public void setFixo(boolean fixo) {
		this.fixo = fixo;
	}
}