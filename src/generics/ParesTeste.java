package generics;

public class ParesTeste {
    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();
        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "Gui");
        resultadoConcurso.adicionar(3, "Ana");
        resultadoConcurso.adicionar(4, "Edu");
        resultadoConcurso.adicionar(2, "Rebeca");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(4));
        System.out.println(resultadoConcurso.getValor(2));
    }
}
