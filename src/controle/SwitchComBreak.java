package controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String conceito = "";

        System.out.println("Informe uma nota: ");
        int nota = entrada.nextInt();

        //Java 17
        switch (nota){
            case 10, 9 -> conceito = "A";
            case 8, 7 -> conceito = "B";
            case 6, 5 -> conceito = "C";
            case 4, 3 -> conceito = "D";
            case 2, 1 -> conceito = "E";
            case 0 -> conceito = "Sem rendimento.";
            default -> conceito = "Conceito Inválido.";
        }
        /* Java 8
        switch (nota) {
            case 10:
            case 9:
                conceito = "A";
                break;
            case 8:
            case 7:
                conceito = "B";
                break;
            case 6:
            case 5:
                conceito = "C";
                break;
            case 4:
            case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
                conceito = "E";
                break;
            case 0:
                conceito = "Sem rendimento.";
                break;
            default:
                conceito = "Conceito inválido.";
        }
        */
        System.out.println("O Conceito é: " + conceito);
        entrada.close();
    }
}
