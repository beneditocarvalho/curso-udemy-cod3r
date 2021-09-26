package cursoUdemyLeo.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    public static Connection getConexao() {
        try {
            Properties properties = getProperties();
            String url = properties.getProperty("dburl");
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static Properties getProperties() {
        Properties properties;
        try (FileInputStream fs = new FileInputStream("conexao.properties")) {
            properties = new Properties();
            properties.load(fs);
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return properties;
    }

}
