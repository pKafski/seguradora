package org.example.tipos;

public enum Zona {
    RURAL (1, "Rural"),
    SUBURBANA (2, "Suburbio"),
    URBANA (3, "Urbano");
    private int codigo;
    private String descricao;

    Zona(int codigo, String descricao) {
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
