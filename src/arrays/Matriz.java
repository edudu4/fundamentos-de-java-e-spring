package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a quantidade alunos: ");
        int quantidadeAlunos = entrada.nextInt();

        System.out.print("Informe a quantidade de notas: ");
        int quantidadeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[quantidadeAlunos][quantidadeNotas];
        double total = 0;

        for (int aluno = 0; aluno < quantidadeAlunos; aluno++) {
            for (int nota = 0; nota < quantidadeNotas; nota++) {
                System.out.printf("Digite a nota %d do aluno %d: ", nota + 1, aluno + 1);
                notasDaTurma[aluno][nota] = entrada.nextDouble();
                total += notasDaTurma[aluno][nota];
            }
        }

        System.out.println("Notas informadas: ");
        for (double[] notas: notasDaTurma) {
            System.out.println("| " + Arrays.toString(notas) + " | ");
        }

        double media = total/(quantidadeAlunos * quantidadeNotas);
        System.out.println("A média da turma ficou em " + media);
        entrada.close();
    }
}
