package oo.heranca.teste;

import oo.heranca.ENUMDirecao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 15;

        Heroi heroi = new Heroi(10, 16);


        System.out.println("Vida Monstro: " + monstro.vida);
        System.out.println("Vida Heroi: " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Vida Monstro: " + monstro.vida);
        System.out.println("Vida Heroi: " + heroi.vida);

        System.out.println("------------------------");

        monstro.andar(ENUMDirecao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Vida Monstro: " + monstro.vida);
        System.out.println("Vida Heroi: " + heroi.vida);


        System.out.println("Posição X e Y Monstro: " + monstro.x + " " + monstro.y);
        System.out.println("Posição X e Y Heroi: " + heroi.x + " " + heroi.y);

    }
}
