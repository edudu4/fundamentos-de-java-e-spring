package jdbc;

public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
        dao.incluir(sql, "Ana", 100);
        dao.incluir(sql, "Bia", 101);
        dao.incluir(sql, "João", 102);
        dao.incluir(sql, "David", 103);

        dao.closeConnection();
    }
}
