package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
    boolean ligarTurbo = false;
    boolean ligarAr = false;

    public Ferrari() {
        super(450);
    }

    public boolean acelerar() {
        if (super.acelerar()) {
            velocidadeAtual += 20;
            return true;
        } else {
            return false;
        }
    }

    public boolean frear() {
        if (super.frear() && velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public double getDelta() {
        if (ligarTurbo && !ligarAr) {
            return super.getDelta() * 2;
        } else if (ligarTurbo && ligarAr) {
            return super.getDelta() * 1.7;
        } else if (!ligarTurbo && ligarAr) {
            return super.getDelta() * 1.5;
        }
        return super.getDelta();
    }
}
