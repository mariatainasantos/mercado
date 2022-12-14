package com.mycompany.mercado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class Operacoes {

    public List<MercadoEspecifico> ler(Connection con) throws SQLException{
        List lc = new LinkedList();  
        ResultSet rs = con.createStatement()
                .executeQuery("select fornecedor, produto, funcionario, cliente, nome"
                        + "cnpj from mercadoEspecifico");
        while(rs.next()){
            int cn = rs.getInt("cnpj");
            String cli = rs.getString("cliente");
            String no = rs.getString("nome");
            String forn = rs.getString("fornecedor");
            String fun = rs.getString("funcionario");
            String pro = rs.getString("produto");
            
            MercadoEspecifico mercadoE = new MercadoEspecifico(cn, cli, no, forn, fun, pro);
            lc.add(mercadoE);
        }
       
        return lc;
       
    }
   
    public void vender(Connection con, MercadoEspecifico mercadoE){
        String sql = "insert into mercadoE (cnpj, cliente, nome, fornecedor, funcionario, produto) values (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, mercadoE.getCnpj());
            stm.setString(2, mercadoE.getCliente());
            stm.setString(3, mercadoE.getNome());
            stm.setString(4, mercadoE.getFornecedor());
            stm.setString(5, mercadoE.getFuncionario());
            stm.setString(6, mercadoE.getProduto());
            stm.executeUpdate();
        } catch (Exception e) {
        }
    }
   
    public void demitir(Connection con, MercadoEspecifico mercadoE){
        String sql = "delete mercadoE where funcionario = ?";
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, mercadoE.getFuncionario());
            stm.executeUpdate();
        } catch (Exception e) {
        }
       
    }
   
    public void contratar(Connection con, MercadoEspecifico mercadoE) throws SQLException{
        String sql = "update mercadoE set funcionario=? ";
        PreparedStatement stm = con.prepareStatement(sql);
        
        stm.setInt(1, mercadoE.getCnpj());
            stm.setString(2, mercadoE.getCliente());
            stm.setString(3, mercadoE.getNome());
            stm.setString(4, mercadoE.getFornecedor());
            stm.setString(5, mercadoE.getFuncionario());
            stm.setString(6, mercadoE.getProduto());
            stm.executeUpdate();
    }
}