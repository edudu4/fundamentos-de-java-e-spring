package oo.heranca.desafio;

public class Carro {
    public final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual = 0;
    private double delta = 5;

    public Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public boolean acelerar() {
        if (!((velocidadeAtual + getDelta()) > VELOCIDADE_MAXIMA)) {
            velocidadeAtual += getDelta();
            return true;
        } else {
            return false;
        }
    }

    public boolean frear() {
        if (velocidadeAtual > 0) {
            if (velocidadeAtual < 5) {
                velocidadeAtual -= 1;
                return true;
            } else {
                velocidadeAtual -= 5;
                return true;
            }
        } else {
            return false;
        }
    }

    public double getDelta() {
        return delta;
    }
    public void setDelta(int delta) {
        this.delta = delta;
    }

    public String toString() {
        return velocidadeAtual + "Km/h.";
    }
}

