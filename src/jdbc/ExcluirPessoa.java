package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o c�digo da pessoa que deseja remover.");

        Connection connection = FabricaConexao.getConexao();
        String sql = "DELETE FROM pessoas WHERE codigo = ?";

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, entrada.nextInt());

        if(stmt.executeUpdate() > 0){
            System.out.println("Pessoa exclu�da com sucesso!");
        } else {
            System.out.println("Ningu�m foi exclu�do.");
        }

        connection.close();
        entrada.close();
    }
}
