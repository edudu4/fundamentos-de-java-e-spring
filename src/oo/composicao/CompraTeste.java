package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.nomeCliente = "Eduardo";

        compra1.adicionarProduto("Caneta", 5, 6.25);
        compra1.adicionarProduto("Lapis", 3, 3.99);
        compra1.adicionarProduto("Borracha", 2, 3.50);
        compra1.adicionarProduto("Caderno", 4, 19.99);

        System.out.println(compra1.produtos.size());
        System.out.println(compra1.getValorTotal());

    }
}
