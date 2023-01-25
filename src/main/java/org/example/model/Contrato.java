package org.example.model;

public abstract class Contrato {
    private Cliente cliente;
    private float valorImovel;

    public abstract Float obterValorSeguro();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValorImovel() {
        return valorImovel;
    }

    public void setValorImovel(float valorImovel) {
        this.valorImovel = valorImovel;
    }
}
