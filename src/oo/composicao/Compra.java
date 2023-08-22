package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    String nomeCliente;
    List<Produto> produtos = new ArrayList<Produto>();
    double valorTotal = 0;

    void adicionarProduto(String nome, int quantidade, double preco) {
        this.adicionarProduto(new Produto(nome, quantidade, preco));
    }
    void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
        produto.compra = this;
    }

    double getValorTotal() {
        if(!produtos.isEmpty()) {
            for (Produto produto : produtos) {
                valorTotal += produto.preco * produto.quantidade;
            }
        }

        return valorTotal;
    }
}
