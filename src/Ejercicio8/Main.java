package Ejercicio8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> list= Arrays.asList(
                "Queso","tomate","salsa","canelones","pan","lechuga");
        Predicate<String>predicate=a->a.startsWith("A");
        Predicate<String>predicate1=a->a.length()==5;
        Predicate<String>predicate2=predicate.and(predicate1);
        Consumer<String> consumer=System.out::println;
        for(String lista:list){
            if(predicate2.test(lista)){
                consumer.accept(lista);
            }
        }
    }
}
