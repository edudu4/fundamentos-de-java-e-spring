package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
        System.out.printf("Preço %s com desconto: R$%.2f\n" ,p1.nome, precoFinal1);
        System.out.printf("Preço %s com desconto: R$%.2f\n",p1.nome, precoFinal2);
        System.out.printf("Média de preço Carrinho de Compras: R$%.2f", mediaCarrinho);
    }
}
