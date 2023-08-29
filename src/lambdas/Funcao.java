package lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar =
                n -> n % 2 == 0 ? "Par" : "Ímpar";
        Function<String, String> animado =
                res -> res + "!!!";
        Function<String, String> duvida =
                res -> res + "???";
        Function<String, String> oResultadoE =
                res -> "O Resultado é: " + res;

        String resultadoFinal = parOuImpar
                .andThen(oResultadoE)
                .andThen(animado)
                .apply(34);

        String resultadoFinalDuvida = parOuImpar
                .andThen(oResultadoE)
                .andThen(duvida)
                .apply(35);

        System.out.println(resultadoFinal);
        System.out.println(resultadoFinalDuvida);


//        String resultadoFinal = oResultadoE(animado(parOuImpar(34)));
//
//        System.out.println(resultadoFinal);


    }

//    static public String parOuImpar(int n) {
//        return n % 2 == 0 ? "Par" : "Ímpar";
//    }
//
//    static String animado(String res) {
//        return res + "!!!";
//    }
//
//    static String duvida(String res) {
//        return res + "???";
//    }
//
//    static String oResultadoE(String res) {
//        return "O Resultado é: " + res;
//    }
}

