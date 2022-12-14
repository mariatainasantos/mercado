package com.mycompany.mercado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conexao {
   
    public static void main(String[] args) throws SQLException  {
        Connection con = null;
       
        try {
            con = DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/ifpe", "root", "root");

        Fornecedor f = new Fornecedor(2, "Maria Tainá Santos Rocha Gomes de Oliveira", 999244357, "Nestlé");
        Cliente c = new Cliente(16785439, "João Pedro Oliveira Fonseca");
        Funcionario fu = new Funcionario(1, "Manhã", 1200, "Frios");
        Produto p = new Produto(918273, "Nestlé", "Higiene", 20);
        MercadoEspecifico m = new MercadoEspecifico(5647380, "Atacadão", "MegaFort Atacadista", "Carne", "Letícia Gomes da Silva", "Emilly Daiane Soares Barro");
       

        } catch (SQLException ex) {
            ex.getStackTrace();
        } finally{
            if(con!=null)
               con.close();
        }        
    }

}