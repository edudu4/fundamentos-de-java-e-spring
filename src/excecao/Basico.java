package excecao;

public class Basico {
    public static void main(String[] args) {

        try {
            Aluno a1 = null;
            imprimeNomeDoAluno(a1);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        System.out.println("fim");
    }

    public static void imprimeNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.getNome());
    }
}
