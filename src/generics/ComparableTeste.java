package generics;

import java.util.TreeSet;

public class ComparableTeste {
    public static void main(String[] args) {
        // Integer já implementa a interface comparable
        TreeSet<Integer> nums = new TreeSet<>();

        nums.add(10);
        nums.add(2);
        nums.add(123);
        nums.add(4);
        nums.add(1);
        nums.add(8);

        nums.forEach(System.out::println);
    }
}
