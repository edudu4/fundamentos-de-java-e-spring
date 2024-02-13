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

    // Exce��o N�O checada
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal! #01");
    }

    // Exce��o checada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro bem legal! #02");
    }

}
