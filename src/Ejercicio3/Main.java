package Ejercicio3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer>predicate=a->a>100 || a<50;
        System.out.println(predicate.test(51));
    }
}
