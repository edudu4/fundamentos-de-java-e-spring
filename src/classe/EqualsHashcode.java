package classe;

public class EqualsHashcode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Eduardo Alves";
        u1.email = "eduardo@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Eduardo Alves";
        u2.email = "eduardo@email.com";


        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
    }
}
