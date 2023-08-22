package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class desafioTeste {
    public static void main(String[] args) {

        Carro carroPopular = new Carro(300);
        Ferrari carroFerrari = new Ferrari();
        Carro carroCivic = new Civic();

        System.out.println("------------------------Velocidades------------");
        System.out.println("Velocidade Inicial da Ferrari: " + carroFerrari);
        System.out.println("Velocidade Inicial do Civic: " + carroCivic);
        System.out.println("Velocidade Inicial do Carro Popular: " + carroPopular);
        System.out.println();
        System.out.println();

        carroFerrari.ligarTurbo();
        carroFerrari.ligarAr();
        carroFerrari.acelerar();
        carroFerrari.acelerar();
        carroFerrari.desligarTurbo();
        carroFerrari.acelerar();
        carroFerrari.frear();
        carroFerrari.frear();

        carroCivic.acelerar();
        carroCivic.acelerar();
        carroCivic.acelerar();
        carroCivic.frear();
        carroCivic.frear();

        carroPopular.acelerar();
        carroPopular.acelerar();
        carroPopular.acelerar();
        carroPopular.frear();

        System.out.println("Velocidade Atual da Ferrari: " + carroFerrari);
        System.out.println("Velocidade Atual do Civic: " + carroCivic);
        System.out.println("Velocidade Atual do Carro Popular: " + carroPopular);
        System.out.println("Velocidade do Ar na Ferrari: " + carroFerrari.velocidadeDoAr());
    }
}
