package Ejercicio7;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main{
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(
                1,22,3,4,5,6,7,8,9,10
        );
        Predicate<Integer>integerPredicate=a->a==22;
        Consumer<Integer>consumer=System.out::println;
        for(Integer list1:list){
            if(integerPredicate.test(list1)){
                consumer.accept(list1);
            }

        }
    }
}
