package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizarPessoa {
    public static void main(String[] args) throws SQLException {
        Connection connection = FabricaConexao.getConexao();
        Scanner entrada = new Scanner(System.in);

        String sql = "SELECT * FROM pessoas where nome = ?";
        String sqlUpdate = "UPDATE pessoas SET nome = ? where codigo = ?";


        System.out.println("Informe o nome exato da pessoa que vc deseja alterar.");

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, entrada.nextLine());

        ResultSet resultSet = preparedStatement.executeQuery();
        Pessoa pessoa = null;

        while (resultSet.next()) {
            pessoa = new Pessoa(resultSet.getInt("codigo"), resultSet.getString("nome"));
        }

        if (pessoa == null) {
            throw new IllegalArgumentException("Erro na hora de buscar uma pessoa.");
        }

        System.out.println("Agora... Informe o novo nome.");
        pessoa.setNome(entrada.nextLine());

        preparedStatement.close();

        preparedStatement = connection.prepareStatement(sqlUpdate);
        preparedStatement.setString(1, pessoa.getNome());
        preparedStatement.setInt(2, pessoa.getCod());

        preparedStatement.executeUpdate();

        ResultSet todasAsPessoasResultSet = connection.createStatement().executeQuery("SELECT * FROM pessoas");

        System.out.println("Todas as pessoas: ");

        while (todasAsPessoasResultSet.next()) {
            Pessoa pessoaIndex = new Pessoa(todasAsPessoasResultSet.getInt("codigo"), todasAsPessoasResultSet.getString("nome"));
            System.out.println(pessoaIndex);
        }

        connection.close();
        entrada.close();
    }
}
