package generics;

import java.util.Objects;

public class Par<C,V> {
    private C chave;
    private V valor;

    public Par() {
    }
    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() {
        return chave;
    }

    public Par<C, V> setChave(C chave) {
        this.chave = chave;
        return this;
    }

    public V getValor() {
        return valor;
    }

    public Par<C, V> setValor(V valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Par<?, ?> par)) return false;
        return Objects.equals(getChave(), par.getChave());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getChave());
    }
}
