package oo.encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setSobrenome(sobrenome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    //Getter
    public int getIdade() {
        return idade;
    }

    //Setter
    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 120) {
            this.idade = idade;
        }
    }
}
