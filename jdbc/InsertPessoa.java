package cursoUdemyLeo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();

        Connection connection = DB.getConexao();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, nome);

        statement.execute();

        System.out.println("Pessoa incluida com sucesso!");

        scanner.close();
        connection.close();

    }
}
