package com.stackoverflow;

public class Coffe {
    private int numeroMesa;
    private int numeroPedido;
    private boolean status;
    private Pagamento pagamento;

    public Coffe(Pagamento pagamento){
        this.pagamento = pagamento;
        }


    public void mostrarMesa() {
        setNumeroMesa(numeroMesa);
        setNumeroPedido(numeroPedido);
        setStatus(status);
        System.out.println("Numero da mesa: "+getNumeroMesa());
        System.out.println("Numero do pedido: "+getNumeroPedido());
        System.out.println("Disponibilidade da mesa: "+getStatus());
        System.out.println("");
    }

    public Coffe() {

    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
