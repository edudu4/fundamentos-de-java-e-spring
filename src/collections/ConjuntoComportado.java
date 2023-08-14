package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set<String> nomes = new HashSet<>();
        SortedSet<String> nomes = new TreeSet<>(); // Conjunto Ordenado
        nomes.add("Eduardo");
        nomes.add("Ana");
        nomes.add("Pedro");
        nomes.add("João");

        if (nomes.contains("Eduardo")) {
            System.out.println("Estou na lista");
        }
        System.out.println("---- Lista de Nomes ----");
        for (String nome : nomes) {
            System.out.println(nome);
        }


        System.out.println("---- Lista de Números ----");
        SortedSet<Integer> nums = new TreeSet<>(); // Conjunto Ordenado
        nums.add(1);
        nums.add(120);
        nums.add(130);
        nums.add(60);

        for (int num : nums){
            System.out.println(num);
        }
    }
}
