package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Principe");
        livros.push("Don quixote");
        livros.push("O Homem de Giz");
        livros.push("O Hobbit");

        System.out.println("---- Livros ----");
        for (String livro : livros){
            System.out.println(livro);
        }

        System.out.println("------ ------");
        System.out.println(livros.peek()); // null
        System.out.println(livros.element()); // exception

        System.out.println(livros.pop());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll()); // Null quando está vazio
        // System.out.println(livros.pop()); Exception quando está vazio
     }
}
