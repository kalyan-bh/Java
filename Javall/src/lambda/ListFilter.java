package lambda;

/*
Create a functional interface Filter that checks if an integer is even.
Use the lambda inside a method that takes a list of integers and returns only even numbers.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

interface Filter{
    boolean check(int number);
}

public class ListFilter {

    public static List<Integer> filterList(List<Integer> lis, Filter isEven){
        return lis.stream()
                .filter(n->isEven.check(n)) //passing the lambda object and filtering
                // .filter(isEven::check) - above statement using method reference
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Filter isEven = (a) -> a % 2 == 0;
       // isEven.check(10);
        List<Integer> lis = Arrays.asList(1, 2, 4, 32, 12, 13, 5, 7, 8);
        System.out.println(filterList(lis,isEven));
    }
}
