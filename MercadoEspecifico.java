package com.mycompany.mercado;

public class MercadoEspecifico {
        
    private int cnpj;
    private String nome;
    private String fornecedor;
    private String produto;
    private String cliente;
    private String funcionario;

    public MercadoEspecifico(int cnpj, String nome, String fornecedor, String produto, String cliente, String funcionario) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.produto = produto;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
 
   public String getProduto(){
       return produto;
   }
   
   public void setProduto(String produto){
       this.produto = produto;
   }
   
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }
}
