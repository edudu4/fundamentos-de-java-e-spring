package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        // Não permite: int -> Double
        // permitido: double -> Double
        BinaryOperator<Double> calc = (numero1, numero2) -> {return numero1 + numero1;};
        System.out.println(calc.apply(2.0,4.0));

        calc = (numero1,numero2) -> numero1 * numero2;
        System.out.println(calc.apply(2.0,4.0));
    }
}
