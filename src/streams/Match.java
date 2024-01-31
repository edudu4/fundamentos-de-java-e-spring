package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Eduardo", 9.2, 'M');
        Aluno a2 = new Aluno("Gui", 8.0, 'm');
        Aluno a3 = new Aluno("Bia", 7.4, 'f');
        Aluno a4 = new Aluno("Lia", 4.8, 'f');
        Aluno a5 = new Aluno("Ana", 9.8, 'f');
        Aluno a6 = new Aluno("João", 3.5, 'm');
        Aluno a7 = new Aluno("Pedro", 2.2, 'm');

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);
        Predicate<Aluno> aprovado = a -> a.getNota() >= 7;

        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado.negate()));
    }
}
