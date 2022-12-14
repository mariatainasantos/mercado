package com.mycompany.mercado;  

import java.sql.Connection;
import java.sql.SQLException;

public interface Construtor {
    public int cnpj ();    
    public String nome ();
    public String fornecedor (); 
    public String produto ();
    public String cliente ();
    public String funcionario ();
    
    
    
    public void vender(Connection con, MercadoEspecifico MercadoEspecifico);
    public void demitir(Connection con, MercadoEspecifico MercadoEspecifico);
    public void contratar(Connection con, MercadoEspecifico MercadoEspecifico);
   
}