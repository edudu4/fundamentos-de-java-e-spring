package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterProduto {
    public static void main(String[] args) {
        Produto p1 = new Produto("Iphone 14", 3999.99, 0.20, true);
        Produto p2 = new Produto("Iphone 12", 2999.99, 0.35, false);
        Produto p3 = new Produto("Ipad", 2499.99, 0.20, true);
        Produto p4 = new Produto("Notebook", 3999.99, 0.40, false);
        Produto p5 = new Produto("Cadeira", 989.99, 0.15, true);
        Produto p6 = new Produto("Macbook", 4599.99, 0.08, true);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);
        Predicate<Produto> isDescontoAlto = p -> p.getDesconto() >= 0.20;
        Predicate<Produto> isFreteGratis = Produto::isFreteGratis;

        produtos.stream()
                .filter(isDescontoAlto)
                .filter(isFreteGratis)
                .map(p -> String.format("Super promoção! %s está custando apenas %.2f, com desconto de %.0f%%"
                        , p.getNome(), p.getPreco(), p.getDesconto()*100))
                .forEach(System.out::println);

    }
}
