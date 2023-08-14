package collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        Usuario u1 = new Usuario("Eduardo");
        listaUsuarios.add(u1);
        listaUsuarios.add(new Usuario("Carlos"));
        listaUsuarios.add(new Usuario("Pedro"));
        listaUsuarios.add(new Usuario("Manu"));
        listaUsuarios.add(new Usuario("David"));

        System.out.println("Pegando pelo indice: " + listaUsuarios.get(3));

        System.out.println("Contém? " + listaUsuarios.contains(u1));

        System.out.println("Removeu o Carlos? " + listaUsuarios.remove(new Usuario("Carlos")));
        System.out.println("Removeu o David? " + listaUsuarios.remove(new Usuario("David")));

        System.out.println("---- Pegando pelo foreach ----");
        for(Usuario usuario : listaUsuarios) {
            System.out.println(usuario);
        }

    }
}
