package com.catarina.continua3;

import java.sql.*;

/**
 *
 * @author catarina
 */
public class Insert {

    public static void Inserindo (String mensagem) {

        ConectarBanco banco = new ConectarBanco();
        
        Connection conectar = banco.Conectar();
        
        try {
            PreparedStatement query = conectar.prepareStatement("insert into cadastro values (default,?);");
            query.setString(1, mensagem);
            query.execute();
            banco.fechar(conectar);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    };

}
