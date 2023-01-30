package org.example.model;

import org.example.tipos.ResidencialEnum;
import org.example.tipos.Zona;

public class ContratoResidencial extends Contrato {
    private String endereco;
    private Zona zona;
    private ResidencialEnum residencialEnum;

    @Override
    public Float obterValorSeguro() {
        return 0.0f;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public ResidencialEnum getResidencialEnum() {
        return residencialEnum;
    }

    public void setResidencialEnum(ResidencialEnum residencialEnum) {
        this.residencialEnum = residencialEnum;
    }

}
