package com.catarina.continua3;

import java.sql.Connection;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.*;

/**
 *
 * @author catarina
 */
public class ConectarBanco {

    public static JdbcTemplate jdbcTemplate;
    public static BasicDataSource dataSource;

    public final static String DRIVE = "com.mysql.cj.jdbc.Driver";
    public final static String URL = "jdbc:mysql://localhost/CONTINUA3?useTimezone=true&serverTimezone=UTC";
    public final static String USERNAME = "root";
    public final static String PASSWORD = "caca1234";
    
    public void fechar(Connection conectar){
        try {
            conectar.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    };
    
    public static Connection Conectar() {

        Connection connection = null;
        try {
            Class.forName(DRIVE);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("conectado");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }


}
