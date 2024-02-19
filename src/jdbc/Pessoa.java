package jdbc;

public class Pessoa {
    private int cod;
    private String nome;

    public Pessoa(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public Pessoa setCod(int cod) {
        this.cod = cod;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "cod = " + cod +
                ", nome= " + nome + '\'' +
                '}';
    }
}
