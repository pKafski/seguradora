package org.example.model;

import org.example.tipos.RamoEnum;

public class ContratoEmpresarial extends Contrato {
    private int numeroVisitas;
    private int numeroFuncionarios;
    private RamoEnum ramoEnum;

    @Override
    public Float obterValorSeguro() {
        Float valorSeguro = obterValorPercentualImovel();
        valorSeguro += obterValorTotalFuncionarios();
        valorSeguro += obterValorVisitas();
        valorSeguro += obterValorRamo();
        return valorSeguro;
    }

    public float obterValorPercentualImovel() {
        float valor = getValorImovel() * 0.04f;
        return valor;
    }

    public float obterValorTotalFuncionarios() {
        int quantidadeFuncionario = getNumeroFuncionarios();
        float valorCalculado = (quantidadeFuncionario / 10) * 0.002f;
        return valorCalculado;
    }

    public float obterValorVisitas() {
        int visitas = getNumeroVisitas();
        float valorCalculado = (visitas / 200) * 0.003f;
        return valorCalculado;
    }

    public float obterValorRamo() {
        if (getRamoEnum().equals(RamoEnum.INDUSTRIA)) {
            return getValorImovel() * 0.01f;
        } else if (getRamoEnum().equals(RamoEnum.COMERCIO)){
            return getValorImovel() * 0.05f;
        }
        return getValorImovel()*0.13f;

    }

    public int getNumeroVisitas() {
        return numeroVisitas;
    }

    public void setNumeroVisitas(int numeroVisitas) {
        this.numeroVisitas = numeroVisitas;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public RamoEnum getRamoEnum() {
        return ramoEnum;
    }

    public void setRamoEnum(RamoEnum ramoEnum) {
        this.ramoEnum = ramoEnum;
    }
}
