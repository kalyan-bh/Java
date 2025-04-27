package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCodes {

    static void evenNum(){
        List<Integer> num= Arrays.asList(123,234,124,547);
        List<Integer> evenNums= num.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNums);
    }


    public static void main(String[] args){
        List<String> lis=Arrays.asList("tim","cook","salt","rock");
        List<String> upperLis= lis.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperLis);
    }
}
