package collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();

        usuarios.add(new Usuario("Eduardo"));
        usuarios.add(new Usuario("Ana"));
        usuarios.add( new Usuario("Guilherme"));
        usuarios.add(new Usuario("Manu"));

        boolean resultado = usuarios.contains(new Usuario("Eduardo"));
        System.out.println(resultado);

    }
}
