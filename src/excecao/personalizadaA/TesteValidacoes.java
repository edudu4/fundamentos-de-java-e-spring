package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Bia", 7, 'F');
            Validar.aluno(aluno);
            Validar.aluno(null);
        } catch (StringVaziaException | NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + "!!");
        }
    }
}
