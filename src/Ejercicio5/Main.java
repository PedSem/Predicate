package Ejercicio5;

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<String,String>stringBiPredicate=String::equalsIgnoreCase;
        System.out.println(stringBiPredicate.test("Hola","Hola"));
    }
}
