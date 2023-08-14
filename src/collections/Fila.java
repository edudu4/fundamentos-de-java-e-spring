package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> Adicionam elementos na fila

        //Diferença é o comportanto
        //Quando a fila está cheia!
        fila.add("Eduardo"); // Lança Exceção
        fila.add("Ana");
        fila.add("Carlos");
        fila.offer("João");  // Retorna false
        fila.offer("Pedro");
        fila.offer("Manu");

        // Peek e Element -> Pegam elementos na fila sem Remover

        //Diferença é o comportanto
        //Quando a fila está vazia!
        System.out.println("--- Pega sem Remover ---");
        System.out.println(fila.peek()); // Retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança Exceção
        System.out.println(fila.element());

        // Poll e Remove -> Pegam elementos na fila e removem

        //Diferença é o comportanto
        //Quando a fila está vazia!
        System.out.println("--- Pega e Remove ---");
        System.out.println(fila.poll()); // Retorna null;
        System.out.println(fila.poll());
        System.out.println(fila.remove()); // Lança Exceção
        System.out.println(fila.remove());

    }
}
