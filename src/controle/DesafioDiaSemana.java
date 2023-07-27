package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        // Domingo -> 1
        // quarta -> 4>
        // terça -> 3
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um dia da semana: ");
        String diaInformado = entrada.next();
        int numeroRetornado;

        if (diaInformado.equalsIgnoreCase("domingo")) {
            numeroRetornado = 1;
            System.out.println(numeroRetornado);
        } else if (diaInformado.equalsIgnoreCase("segunda")) {
            numeroRetornado = 2;
            System.out.println(numeroRetornado);
        } else if (diaInformado.equalsIgnoreCase("terça")
                || diaInformado.equalsIgnoreCase("terca")) {
            numeroRetornado = 3;
            System.out.println(numeroRetornado);
        } else if (diaInformado.equalsIgnoreCase("quarta")) {
            numeroRetornado = 4;
            System.out.println(numeroRetornado);
        } else if (diaInformado.equalsIgnoreCase("quinta")) {
            numeroRetornado = 5;
            System.out.println(numeroRetornado);
        } else if (diaInformado.equalsIgnoreCase("sexta")) {
            numeroRetornado = 6;
            System.out.println(numeroRetornado);
        } else if (diaInformado.equalsIgnoreCase("sábado")
                || diaInformado.equalsIgnoreCase("sabado")) {
            numeroRetornado = 7;
            System.out.println(numeroRetornado);
        } else {
            System.out.println("Informe um dia válido.");
        }
        entrada.close();
    }
}
