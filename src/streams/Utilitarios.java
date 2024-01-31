package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
    private Utilitarios() {
    }

    public static UnaryOperator<String> maiuscula = String::toUpperCase;
    public static UnaryOperator<String> primeiraLetra = s -> String.valueOf(s.charAt(0));

    public static String grito(String s) {
        return s.concat("!!!");
    }
}
