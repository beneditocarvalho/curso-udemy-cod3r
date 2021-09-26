package cursoUdemyLeo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {

        final String strDeConexao = "jdbc:mysql://localhost:3306/wm";
        final String usuario = "root";
        final String senha = "1324";

        Connection connection = DriverManager.getConnection(strDeConexao, usuario, senha);

        connection.createStatement();

        System.out.println("Conexão bem sucedida!!");

        connection.close();

    }
}
