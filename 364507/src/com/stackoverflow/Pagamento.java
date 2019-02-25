package com.stackoverflow;

public class Pagamento {
    private String cpfCliente;
    private int numeroCartao;
    private double valor;

    void mostrarDetalhes() {
        System.out.println("cpf: "+ this.cpfCliente);
        System.out.println("Numero cartao: "+ this.numeroCartao);
        System.out.println("Valor: "+ this.valor+"R$");
        System.out.println("");
    }

    public String getCpfCliente() {
        return cpfCliente;
    }
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    public int getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }


}
