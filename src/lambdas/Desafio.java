package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        /*
        1. A partir do produto calcular o preco real (com desconto)
        2. Imposto Municipal: >= 2500 (8,5%) | < 2500 (Isento)
        3. Frete: >= 3000 (100) | < 3000 (50)
        4. Arredondar: Deixar duas casas decimais
        5. Formatar: R$1234,56
         */

        Produto p = new Produto("IPad", 3199.89, 0.13);

        BinaryOperator<Double> precoComDesconto =
                (preco,desconto) -> preco * (1 - desconto);
        UnaryOperator<Double> imposto =
                preco -> preco >= 2500 ? preco * (1 + 0.085) : preco;
        UnaryOperator<Double> frete =
                preco -> preco >= 3000 ? preco + 100 : preco + 50;
        UnaryOperator<Double> arredondar =
                preco -> Math.round(preco*100)/100.0;
        Function<Double, String>formatar =
                preco -> String.format("R$%.2f", preco).replace(".",",");

        String preco = precoComDesconto
                .andThen(imposto)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p.preco, p.desconto);

        System.out.println("Preço: " + preco);
    }
}
