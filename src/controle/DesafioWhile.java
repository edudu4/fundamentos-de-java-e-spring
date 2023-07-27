package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double notaDigitada = 0;
        double total = 0;
        int repeticoes = 0;


        while (notaDigitada != -1) {
            System.out.println("Informe alguma nota: ");
            repeticoes++;
            notaDigitada = entrada.nextDouble();

            if (notaDigitada >= 0 && notaDigitada <= 10) {
                total += notaDigitada;
            } else if (notaDigitada == -1) {
                System.out.printf("\nA quantidade de notas informadas foi de %d " +
                        "e a MÉDIA das notas é de %.2f", repeticoes, total/repeticoes);
            } else {
                System.out.println("Informe uma nota válida.");
            }
        }
        entrada.close();
    }
}
