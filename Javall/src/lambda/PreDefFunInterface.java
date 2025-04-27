package lambda;

import java.lang.Math;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PreDefFunInterface {

    public static void main(String[] args){

        //single abstract method in consumer is accept
        Consumer<String> printUpperCase=(str)->System.out.println(str.toUpperCase());
        printUpperCase.accept("pre defined functional interface Consumer");


        //single abstract method in Function is apply
        Function<String,Integer> strLength=(str)->str.length();
        int length=strLength.apply("pre defined functional interface called Function");
        System.out.println(length);

        //single abstract method in supplier is get
        Supplier<Double> randomValue=()-> Math.random();
        double value=randomValue.get();
        System.out.println(value);

        //single abstract method in predicate is test
        Predicate<Integer> isEven= a->a%2==0;
        boolean even =isEven.test(5);
        System.out.println(even);



    }
}
