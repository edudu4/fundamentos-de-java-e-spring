package lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo calc = (numero1,numero2) -> {return numero1 + numero1;};
        System.out.println(calc.executar(2,4));

        calc = (numero1,numero2) -> numero1 * numero2;
        System.out.println(calc.executar(2,4));
        System.out.println(calc.legal());
        System.out.println(Calculo.muitoLegal());
    }
}
