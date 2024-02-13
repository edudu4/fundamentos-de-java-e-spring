package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {

        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        geraErro1();
    }

    // Exceção NÃO checada
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal! #01");
    }

    // Exceção checada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro bem legal! #02");
    }

}
