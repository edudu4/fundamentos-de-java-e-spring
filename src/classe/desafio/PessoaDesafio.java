package classe.desafio;

import classe.desafio.ComidaDesafio;

public class PessoaDesafio {
    String nome;
    double peso;

    PessoaDesafio(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(ComidaDesafio comida) {
        this.peso += comida.peso;
        System.out.printf("No jantar de hoje, o cliente %s comeu um prato de %s e engordou %.2fKg"
                , this.nome, comida.nome, comida.peso);
    }

    String getPesoFormatado() {
        return String.format("Atualmente o %s está pesando %.2fKg", this.nome, this.peso);
    }
}
