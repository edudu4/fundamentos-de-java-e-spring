package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioConsultarPessoasFiltradas {
    public static void main(String[] args) throws SQLException {
        Connection connection = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);

        String sql = "SELECT * from Pessoas where nome like ?";

        System.out.println("Digite alguma letra para buscar o nome: ");
        String nome = "%" + entrada.nextLine() + "%";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, nome);

        ResultSet resultSet = preparedStatement.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultSet.next()) {
            pessoas.add(new Pessoa(resultSet.getInt("codigo"), resultSet.getString("nome")));
        }

        pessoas.forEach(System.out::println);

        connection.close();
        entrada.close();
    }
}
