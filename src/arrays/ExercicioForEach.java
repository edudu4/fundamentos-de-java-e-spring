package arrays;

import java.util.Arrays;

public class ExercicioForEach {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];

        notasAlunoA[0] = 7.0;
        notasAlunoA[1] = 8.2;
        notasAlunoA[2] = 7.5;
        notasAlunoA[3] = 10.0;

        double totalAlunoA = 0;
        for (double nota : notasAlunoA) {
            totalAlunoA += nota;
        }
        System.out.println("---- Aluno A ----");
        System.out.println("Notas: " + Arrays.toString(notasAlunoA));
        System.out.println("Nota mais recente: " + notasAlunoA[notasAlunoA.length - 1]);
        System.out.println("Média: " + totalAlunoA/notasAlunoA.length);
        //System.out.println(notasAlunoA[4]); ERRO - Índice fornecido fora dos limites do array

        final int notaArmazenada = 8;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada , 9};

        double totalAlunoB = 0;
        for (double nota : notasAlunoB) {
            totalAlunoB += nota;
        }

        System.out.println("---- Aluno B ----");
        System.out.println("Notas: " + Arrays.toString(notasAlunoB));
        System.out.println("Nota mais recente: " + notasAlunoB[notasAlunoB.length - 1]);
        System.out.println("Média: " + totalAlunoB/notasAlunoB.length);
    }
}
