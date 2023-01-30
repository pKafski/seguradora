package org.example.tipos;

public enum ResidencialEnum {
    APARTAMENTO (1, "Apartamento"),
    CASA (2, "Casa");

    private int codigo;
    private String descricao;

    ResidencialEnum(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
