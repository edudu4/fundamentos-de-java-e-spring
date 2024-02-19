package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:postgresql://localhost:5432/aula";
        final String usuario = "postgres";
        final String senha = "postgres";

        Connection connection = DriverManager
                .getConnection(url, usuario, senha);

        Statement stmt = connection.createStatement();
        stmt.execute("CREATE DATABASE dev");

        System.out.println("Banco criado com sucesso!");
        connection.close();
    }
}
