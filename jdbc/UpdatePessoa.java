package cursoUdemyLeo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePessoa {
    public static void main(String[] args) throws SQLException {
        Scanner scan = new Scanner(System.in);

        System.out.println("ATUALIZAR CADASTRO");
        System.out.print("Insira o Id: ");
        int idPessoa = scan.nextInt();

        String sql = "select * from pessoas where codigo = ?";

        Connection connection = DB.getConexao();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idPessoa);
        ResultSet result = statement.executeQuery();

        if (result.next()) {
            System.out.println("Nome: " + result.getString("nome"));
            System.out.print("Insira novo nome: ");
            scan.nextLine();
            String nome = scan.nextLine();

            String sql2 = "update pessoas set nome = ? where codigo = ?";

            statement.close();
            statement = connection.prepareStatement(sql2);
            statement.setString(1, nome);
            statement.setInt(2, idPessoa);
            statement.execute();

            System.out.println("Dado alterado com sucesso!");
        } else {
            System.out.println("Id não cadastrado!");
        }

        scan.close();
        connection.close();

    }
}