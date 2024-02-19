package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarTodasPessoas {
    public static void main(String[] args) throws SQLException {
        Connection connection = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas";

        Statement stmt = connection.createStatement();

        ResultSet resultSet = stmt.executeQuery(sql);

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultSet.next()) {
            pessoas.add(
                    new Pessoa(resultSet.getInt("codigo"),
                            resultSet.getString("nome")));
        }

        pessoas.forEach(System.out::println);
        connection.close();
    }
}
