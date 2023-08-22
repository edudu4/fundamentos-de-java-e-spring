package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Eduar","Alves",21);
        pessoa.setIdade(22);
        pessoa.setNome("Eduardo");
        System.out.println("Nome: " + pessoa.getNomeCompleto() + "\nIdade: " + pessoa.getIdade());
    }
}
