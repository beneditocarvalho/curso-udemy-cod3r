package cursoUdemyLeo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectPessoas2 {
    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome: ");
        String nome = scanner.nextLine();
        String sql = "select * from pessoas where nome like ?";

        Connection connection = DB.getConexao();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "%" + nome + "%");
        ResultSet result = statement.executeQuery();

        while (result.next()) {
            System.out.println(result.getInt("codigo") + " - " + result.getString("nome"));
        }

        scanner.close();

    }

}