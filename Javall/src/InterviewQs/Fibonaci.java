package InterviewQs;

import java.util.ArrayList;
import java.util.List;

public class Fibonaci {

    static List<Integer> usingListIteration(int n){
        List<Integer> fib=new ArrayList<>();
        if(n<0) return fib;

        fib.add(0);
        if(n==1) return fib;

        fib.add(1);
        for(int i=2;i<n;i++){
            fib.add(fib.get(i-1)+fib.get(i-2));
        }
        return fib;
    }

//recursion, calling the function repeatedly to get the result
    static int fib(int n){
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args){
        int n=10;
        List<Integer> fibSeries=usingListIteration(n);
        System.out.println(fibSeries);

        //using recursion
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(fib(i));
        }
        System.out.println(result);

    }

}
