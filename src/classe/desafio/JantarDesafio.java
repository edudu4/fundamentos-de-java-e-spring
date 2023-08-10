package classe.desafio;

public class JantarDesafio {
    public static void main(String[] args) {
        PessoaDesafio pessoa1 = new PessoaDesafio("Eduardo Alves", 70);
        ComidaDesafio comida1 = new ComidaDesafio("Parmegiana", 0.500);
        System.out.println(pessoa1.getPesoFormatado());
        pessoa1.comer(comida1);
        System.out.println("\n"+pessoa1.getPesoFormatado());
    }
}
