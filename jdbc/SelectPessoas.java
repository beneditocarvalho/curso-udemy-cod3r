package cursoUdemyLeo.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectPessoas {

    public static void main(String[] args) throws SQLException {

        Connection connection = DB.getConexao();
        List<Pessoa> pessoaList = new ArrayList<>();

        String sql = "SELECT * FROM pessoas";

        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);

        while (result.next()) {

            int codigo = result.getInt("codigo");
            String nome = result.getString("nome");
            pessoaList.add(new Pessoa(codigo, nome));

        }

        for (Pessoa p : pessoaList) {
            System.out.println(p.getCodigo() + " - " + p.getNome());
        }

        statement.close();
        connection.close();
    }

}
