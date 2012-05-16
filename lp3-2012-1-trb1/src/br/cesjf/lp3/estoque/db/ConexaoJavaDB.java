/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lp3.estoque.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author curso
 */
public class ConexaoJavaDB {
    private static Connection conexao = null;
    
    public static Connection getConnection() throws Exception {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        if (conexao == null) {
            conexao = DriverManager.getConnection("jdbc:derby://localhost:1527/lp3-2012-db", "usuario", "senha");
        }
        return conexao;
    }

    ;
    public static void closeConnection() throws Exception{
        conexao.close();
    }
;
}
