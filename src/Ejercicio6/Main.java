package Ejercicio6;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(
          1,20,3,4,5,6,7,8,9,10
        );
        Predicate<Integer>integerPredicate=a->a>=25;
        Predicate<Integer>integerPredicate1=a->a<=30;
        Predicate<Integer>andInteger=integerPredicate.and(integerPredicate1);
        boolean existe=false;
        for(Integer num:list){
            if(andInteger.test(num)){
                existe=true;
            }
        }
        System.out.println(existe);
    }
}
