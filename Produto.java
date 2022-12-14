package com.mycompany.mercado;

public class Produto {
    
    private int id;
    private String marca;
    private String categoria;
    private double preço;

    public Produto(int id, String marca, String categoria, double preço) { 
        this.id=id;
        this.marca = marca;
        this.categoria = categoria;
        this.preço = preço;
    }
    
   
    


        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    } 
}
