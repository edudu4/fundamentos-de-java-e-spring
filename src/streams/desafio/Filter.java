package streams.desafio;

import streams.Aluno;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Edu", 9.2, 'M');
        Aluno a2 = new Aluno("Gui", 8.0, 'm');
        Aluno a3 = new Aluno("Bia", 7.4, 'f');
        Aluno a4 = new Aluno("Lia", 4.8, 'f');
        Aluno a5 = new Aluno("Ana", 9.8, 'f');
        Aluno a6 = new Aluno("João", 3.5, 'm');
        Aluno a7 = new Aluno("Pedro", 2.2, 'm');

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);

        Predicate<Aluno> aprovado = a -> a.getNota() >= 7.0;
        Predicate<Aluno> isSexoMasculino = a -> a.getSexo().equals("M");
        Function<Aluno, String> mensagemAprovado = a -> {
            String status = aprovado.test(a) ? "aprovad" : "reprovad";
            return String.format("%s você foi %s%s e ficou com nota de %.2f"
                    , a.getNome(), status, isSexoMasculino.test(a) ? "o" : "a", a.getNota());
        };

        System.out.println("----Alunos Aprovados----");
        alunos.stream()
                .filter(aprovado)
                .map(mensagemAprovado)
                .forEach(System.out::println);

        System.out.println("----Reprovados----");
        alunos.stream()
                .filter(aprovado.negate())
                .map(mensagemAprovado)
                .forEach(System.out::println);

        System.out.println("----Alunos reprovados com Nome 3 Letras----");
        alunos.stream()
                .filter(aprovado.negate())
                .filter(a -> a.getNome().length() == 3)
                .map(mensagemAprovado)
                .forEach(System.out::println);
    }
}
