package oo.composicao.desafio;

public class CompraTeste {
    public static void main(String[] args) {

        Produto produto = new Produto("Iphone 14",6.000);
        Item item = new Item(3, produto);
        Compra compra = new Compra(item);
        Cliente cliente = new Cliente("Eduardo",compra);

        System.out.println("-------Compra-------");
        System.out.printf("O Cliente %s fez %d compras e gastou um total de R$%.3f",
                cliente.nome, cliente.compras.size() + 1, cliente.obterValorTotal());

    }
}
