package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:postgresql://localhost:5432/aula";
        final String usuario = "postgres";
        final String senha = "postgres";

        Connection connection = DriverManager
                .getConnection(url, usuario, senha);

        System.out.println("Conexão efetuada com sucesso!");
        connection.close();
    }
}
