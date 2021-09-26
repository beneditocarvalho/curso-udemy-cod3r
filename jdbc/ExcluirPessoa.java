package cursoUdemyLeo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {

        Scanner scan = new Scanner(System.in);
        System.out.print("Insira o Id: ");
        int idPessoa = scan.nextInt();

        Connection connection = DB.getConexao();
        String sql = "delete from pessoas where codigo = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idPessoa);
        if (statement.executeUpdate() > 0) {
            System.out.println("Dado excluído com sucesso!!");
        } else {
            System.out.println("Código não encontrado!!");
        }
        scan.close();
        connection.close();
    }
}
