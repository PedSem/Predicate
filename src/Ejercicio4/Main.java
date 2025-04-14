package Ejercicio4;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer>integerPredicate=a->a!=100;
        System.out.println(integerPredicate.test(99));
    }
}
