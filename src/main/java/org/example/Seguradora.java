package org.example;

import org.example.model.Cliente;
import org.example.model.Contrato;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Seguradora {
    ArrayList<Cliente> listaCliente = new ArrayList<>();
    ArrayList<Contrato> listaContrato = new ArrayList<>();

    public void cadastrarCliente(Cliente cliente) {
        getListaCliente().add(cliente);
        System.out.println("Cadastro realizado com sucesso");
    }

    public void cadastrarContrato (Contrato contrato) {
        getListaContrato().add(contrato);
        System.out.println("Contrato realizado com sucesso");
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public ArrayList<Contrato> getListaContrato() {
        return listaContrato;
    }

    public void setListaContrato(ArrayList<Contrato> listaContrato) {
        this.listaContrato = listaContrato;
    }
}
