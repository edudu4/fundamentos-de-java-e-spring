package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome, Compra compra) {
        this.nome = nome;
        this.compras.add(compra);
    }

    double obterValorTotal() {
        double valorTotal = 0;
        if (!compras.isEmpty()){
            for (Compra compra : compras) {
                valorTotal+= compra.obterValorTotal();
            }
        }
        return valorTotal;
    }
}
