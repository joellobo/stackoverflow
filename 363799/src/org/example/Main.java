package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> prods = Arrays.asList("p1", "p2");
		Entra entra = new Entra(new Date(), 0.0, "teste", 0, prods, true);
		
		List<Entra> lista = new ArrayList<>(Arrays.asList(entra));
	}

}
