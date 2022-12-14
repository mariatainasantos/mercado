package com.mycompany.mercado;

public class Fornecedor {
    private int id;
    private String nome;
    private int telefone;
    private String empresa;

    public Fornecedor(int id, String nome, int telefone, String empresa) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
 
}
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}