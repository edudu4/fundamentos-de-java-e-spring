package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Eduardo");
        Aluno aluno2 = new Aluno("João");
        Aluno aluno3 = new Aluno("Manu");
        Aluno aluno4 = new Aluno("Ana");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Angular 2023");
        Curso curso3 = new Curso("Padrões de Projetos com Java");

        curso1.alunos.add(aluno1);
        curso1.alunos.add(aluno3);
        curso1.alunos.add(aluno2);

        curso2.alunos.add(aluno1);
        curso2.alunos.add(aluno4);
        curso2.alunos.add(aluno3);


        aluno1.cursos.add(curso3);
        aluno2.cursos.add(curso3);
        aluno3.cursos.add(curso3);
        aluno4.cursos.add(curso3);


        curso3.alunos.add(aluno1);
        curso3.alunos.add(aluno2);
        curso3.alunos.add(aluno3);
        curso1.alunos.add(aluno4);

        System.out.printf("--------Alunos do Curso %s--------\n", curso1.nome);
        for (Aluno aluno : curso1.alunos) {
            System.out.println("Nome: " + aluno.nome);
        }
        System.out.printf("--------Alunos do Curso %s--------\n", curso2.nome);
        for (Aluno aluno : curso2.alunos) {
            System.out.println("Nome: " + aluno.nome);
        }
        System.out.printf("--------Alunos do Curso %s--------\n", curso3.nome);
        for (Aluno aluno : curso3.alunos) {
            System.out.println("Nome: " + aluno.nome);
        }

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Padrões de Projetos com Java");

        System.out.println("\n########Curso Encontrado pelo Nome########");
        if(cursoEncontrado != null) {
            System.out.println("Curso encontrado: " + cursoEncontrado.nome);
            System.out.println("Alunos do curso encontrado: " + cursoEncontrado.alunos);
        }
    }
}
