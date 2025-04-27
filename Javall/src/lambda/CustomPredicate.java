package lambda;
/*
Custom Predicate:
Create a functional interface Condition<T> that checks any condition on a type T.
Write a generic method that accepts a list and a condition, returning only elements that satisfy it.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Condition<T>{
    boolean test(T t);
}

public class CustomPredicate {

    public static <T> List<T> filter(List<T> list,Condition<T> stratsWithA){
        return list.stream()
                .filter(s->stratsWithA.test(s))
                //.filter(stratsWithA::test) - above statement with mehtod reference
                .collect(Collectors.toList());
    }

    public static void main(String[] args){
        List<String> names= Arrays.asList("alice","bob","ram","sai","akash"); //multiple input so we have to use streams
        Condition<String> startsWithA=name->name.startsWith("a");
        System.out.println(filter(names,startsWithA));
    }
}
