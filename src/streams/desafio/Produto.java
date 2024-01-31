package streams.desafio;

public class Produto {
    private String nome;
    private Double preco;
    private Double desconto;
    private boolean isFreteGratis;

    public Produto(String nome, Double preco, Double desconto, boolean isFreteGratis) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.isFreteGratis = isFreteGratis;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    public boolean isFreteGratis() {
        return isFreteGratis;
    }
}
