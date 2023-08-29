package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");

        Produto p1 = new Produto("Caneta", 12.30, 0.15);
        imprimir.accept(p1);

        System.out.println();

        Produto p2 = new Produto("Notebook", 2999.80, 0.25);
        Produto p3 = new Produto("Caderno", 19.80, 0.17);
        Produto p4 = new Produto("Lapis", 5.50, 0.15);
        Produto p5 = new Produto("Borracha", 4.99, 0.15);
        Produto p6 = new Produto("Mochila", 249.99, 0.20);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);
        System.out.println("-----ForEach Consumer-----");
        produtos.forEach(imprimir);

        System.out.println("\n-----ForEach Lambda-----");
        produtos.forEach(p -> System.out.println("Nome: " + p.nome + " | Desconto: " + p.desconto));

        System.out.println("\n-----ForEach Method Ref-----");
        produtos.forEach(System.out::println);
    }
}
