package oo.heranca;

public class Monstro extends Jogador {
    public Monstro() {
        this(10, 15);
        this.vida += 50;
    }

    public Monstro(int x, int y) {
        super(x, y);
    }
}
