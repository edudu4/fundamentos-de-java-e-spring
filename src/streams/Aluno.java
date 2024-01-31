package streams;

import java.util.Objects;

public class Aluno {
    private final String nome;
    private final double nota;
    private final String sexo;

    public Aluno(String nome, double nota, char sexo) {
        this.nome = nome;
        this.nota = nota;
        this.sexo = String.format(String.valueOf(sexo)).toUpperCase();
    }

    public double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Double.compare(getNota(), aluno.getNota()) == 0 && Objects.equals(getNome(), aluno.getNome()) && Objects.equals(getSexo(), aluno.getSexo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getNota(), getSexo());
    }
}
