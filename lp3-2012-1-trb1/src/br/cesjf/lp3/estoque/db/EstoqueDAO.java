/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lp3.estoque.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author lsantana
 */
public class EstoqueDAO {

    public void Inserir(Estoque object) {
        Connection con = null;
        PreparedStatement comando = null;

        try {
            con = ConnectionFactory.getConnectionjdbc();
            String vSQL = "INSERT INTO estoque(filial, produto, quantidade) VALUES(?, ?, ?)";
            comando = con.prepareStatement(vSQL);

            comando.setString(1, object.getFilial());
            comando.setString(2, object.getProduto());
            comando.setInt(3, object.getQuantidade());

            comando.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                comando.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }

    public void Alterar(Estoque object) {
        Connection con = null;
        PreparedStatement comando = null;
        try {
            con = ConnectionFactory.getConnectionjdbc();
            String vSQL = "UPDATE estoque set"
                    + " quantidade = ?"
                    + " WHERE filial = ? AND produto = ?";
            comando = con.prepareStatement(vSQL);

            comando.setInt(1, object.getQuantidade());
            comando.setString(2, object.getFilial());
            comando.setString(3, object.getProduto());

            comando.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                comando.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void Apagar(Estoque object) {
        Connection con = null;
        PreparedStatement comando = null;
        try {
            con = ConnectionFactory.getConnectionjdbc();
            String vSQL = "DELETE FROM estoque WHERE filial = ? AND produto = ?";
            comando = con.prepareStatement(vSQL);

            comando.setString(1, object.getFilial());
            comando.setString(2, object.getProduto());

            comando.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                comando.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public Estoque BuscarConsulta(Estoque object) {
        Connection con = null;
        PreparedStatement comando = null;
        ResultSet rs = null;

        try {
            con = ConnectionFactory.getConnectionjdbc();
            String vSQL = "SELECT * FROM estoque WHERE filial = ? AND produto = ?";
            comando = con.prepareStatement(vSQL);

            comando.setString(1, object.getFilial());
            comando.setString(2, object.getProduto());

            comando.executeQuery();
            rs = comando.executeQuery();
            Estoque o = null;
            if (rs.next()){
                o = new Estoque();
                o.setFilial(rs.getString("filial"));
                o.setProduto(rs.getString("produto"));
                o.setQuantidade(rs.getInt("quantidade"));  
            }
            return o;    
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                comando.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public ArrayList<Estoque> BuscarTodos() {
        Connection con = null;
        PreparedStatement comando = null;
        ResultSet rs = null;
        
        ArrayList<Estoque> lst = new ArrayList<Estoque>();
        try {
            con = ConnectionFactory.getConnectionjdbc();
            String vSQL = "SELECT DISTINCT(filial) FROM estoque";  
            comando = con.prepareStatement(vSQL);
            
            rs = comando.executeQuery();
            Estoque o = null;
            while (rs.next()){
                o = new Estoque();
                o.setFilial(rs.getString("filial"));
                //o.setProduto(rs.getString("produto"));
                //o.setQuantidade(rs.getInt("quantidade"));                
                lst.add(o);
            }
            return lst;            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }finally{
            try{
                comando.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace(); 
            }
        }
        
    }   
    
    
     public ArrayList<Estoque> Buscar(Estoque object) {
        Connection con = null;
        PreparedStatement comando = null;
        ResultSet rs = null;
        
        ArrayList<Estoque> lst = new ArrayList<Estoque>();
        try {
            con = ConnectionFactory.getConnectionjdbc();
            String vSQL = "SELECT * FROM estoque WHERE filial = ?";  
            comando = con.prepareStatement(vSQL);
            
            comando.setString(1, object.getFilial());
            rs = comando.executeQuery();
            Estoque o = null;
            while (rs.next()){
                o = new Estoque();
                o.setFilial(rs.getString("filial"));
                o.setProduto(rs.getString("produto"));
                o.setQuantidade(rs.getInt("quantidade"));
                
                lst.add(o);
            }
            return lst;            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }finally{
            try{
                comando.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace(); 
            }
        }
    }
     
     
      public ArrayList<Estoque> BuscarRelatorio() {
        Connection con = null;
        PreparedStatement comando = null;
        ResultSet rs = null;
        
        ArrayList<Estoque> lst = new ArrayList<Estoque>();
        try {
            con = ConnectionFactory.getConnectionjdbc();
            String vSQL = "SELECT * FROM estoque ORDER BY filial, produto";  
            comando = con.prepareStatement(vSQL);
            
            rs = comando.executeQuery();
            Estoque o = null;
            while (rs.next()){
                o = new Estoque();
                o.setFilial(rs.getString("filial"));
                o.setProduto(rs.getString("produto"));
                o.setQuantidade(rs.getInt("quantidade"));                
                lst.add(o);
            }
            return lst;            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }finally{
            try{
                comando.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace(); 
            }
        }
        
    }
    
    
}
