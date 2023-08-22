package oo.heranca;

public class Heroi extends Jogador {

    public Heroi(int x, int y) {
        super(x, y);
    }

    public boolean atacar(Jogador jogador) {
        boolean ataque1 = super.atacar(jogador);
        boolean ataque2 = super.atacar(jogador);
        boolean ataque3 = super.atacar(jogador);

        return ataque1 || ataque2 || ataque3;
    }
}
