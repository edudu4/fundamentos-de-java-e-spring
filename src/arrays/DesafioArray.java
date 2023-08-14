package arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite quantas notas você quer informar: ");
        int quantidadeNotas = entrada.nextInt();

        double[] notas = new double[quantidadeNotas];
        double total = 0;

        for(int i = 0; i < notas.length; i++) {
            System.out.printf("Informe a %dª nota: ", i + 1);
            notas[i] = entrada.nextDouble();
        }

        for(double nota : notas){
            total += nota;
        }

        System.out.printf("Média: %.2f", total/quantidadeNotas);
        entrada.close();
    }
}
