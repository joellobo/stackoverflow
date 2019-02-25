package com.stackoverflow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	
    	List<Coffe> clientes = new ArrayList<>();

        Coffe cliente1 = new Coffe();
        cliente1.setNumeroMesa(1);
        cliente1.setNumeroPedido(7);
        cliente1.setStatus(true);
        cliente1.mostrarMesa();
        
        
        clientes.add(cliente1);

        Pagamento c1 = new Pagamento();
        c1.setCpfCliente("111020201");
        c1.setNumeroCartao(1903003);
        c1.setValor(35);
        c1.mostrarDetalhes();

        Coffe cliente2 = new Coffe();
        cliente2.setNumeroMesa(1);
        cliente2.setNumeroPedido(7);
        cliente2.setStatus(true);
        cliente2.mostrarMesa();
    }

}
