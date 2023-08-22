package oo.composicao.desafio;

public class Item {
    Produto produto;
    int quantidade;

    Item(int quantidade, Produto produto) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
