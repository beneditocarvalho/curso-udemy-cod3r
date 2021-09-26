package cursoUdemyLeo.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    public static void main(String[] args) throws SQLException {

        Connection connection = DB.getConexao();

        Statement statement = connection.createStatement();

        statement.execute("create database if not exists curso_Java");

        System.out.println("Comando bem sucedido!");

        connection.close();
    }

}