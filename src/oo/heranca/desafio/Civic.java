package oo.heranca.desafio;

public class Civic extends Carro {
    public Civic() {
        this(350);
    }

    public Civic(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(10);
    }
//    boolean acelerar() {
//        if (super.acelerar()) {
//            velocidadeAtual += 5;
//            return true;
//        } else
//            return false;
//    }
}
