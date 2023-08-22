package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    Compra(Item item) {
        this.itens.add(item);
    }

    double obterValorTotal() {
        double valorTotal = 0;
        if(itens != null) {
            for (Item item : itens ) {
                valorTotal += item.produto.preco * item.quantidade;
            }
        }
        return valorTotal;
    }
}
