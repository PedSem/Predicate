package Ejercicio9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> list= Arrays.asList(
                "Queso","tomate","salsa","canelones","pan","lechuga");
        Predicate<String>predicate=a->!a.startsWith("P");
        Consumer<String>consumer=System.out::println;
        for(String lista:list){
            if(predicate.test(lista)){
                consumer.accept(lista);
            }
        }
    }
}
