package cursoUdemyLeo.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {

    public static void main(String[] args) throws SQLException {

        Connection connection = DB.getConexao();

        String sql = "create table if not exists pessoas (" 
        		+ "codigo INT AUTO_INCREMENT PRIMARY KEY," 
        		+ "nome VARCHAR(80) NOT NULL" 
        		+ ")";

        Statement statement = connection.createStatement();
        statement.execute(sql);

        System.out.println("Tabela criada com sucesso!");
        connection.close();

    }
}
