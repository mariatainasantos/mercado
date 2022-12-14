package com.mycompany.mercado;

public class Funcionario {
    
    private int id;
    private String turno;
    private double salario;
    private String setor;

    public Funcionario(int id, String turno, double salario, String setor) {
        this.id = id;
        this.turno = turno;
        this.salario = salario;
        this.setor = setor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
 
   public String getSetor(){
       return setor;
   }
   
   public void setSetor(String setor){
       this.setor = setor;
   }
}
