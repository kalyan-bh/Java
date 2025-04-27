package lambda;

@FunctionalInterface
interface Math{
    int calculate(int a, int b);
}

public class MathOperation {

    public static void main(String[] args){
        Math sum= (a,b)->a+b;
        System.out.println(sum.calculate(4,5));

        Math sub=(a,b)->a-b;
        int result=sub.calculate(8,2);
        System.out.println("substaction of a ,b is "+result);

        Math mul=(a,b)->a*b;
        System.out.println("Multiplication is "+mul.calculate(4,2));

        Math div=(a,b)->a/b;
        System.out.println(div.calculate(6,3));
    }
}
