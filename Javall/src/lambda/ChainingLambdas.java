package lambda;
/*
Chaining Lambdas:
Functional interface Transformer that transforms an integer to another integer.
Chain two transformers: one that multiplies by 2, and another that adds 10.
 */

@FunctionalInterface
interface Transformer{
    int transfoprmer(int number);
}

public class ChainingLambdas {

    public static void main(String[] args){
        Transformer multiplyBy2=n->n*2;
        Transformer add10=n->n+10;

        Transformer combined=n->add10.transfoprmer(multiplyBy2.transfoprmer(n));
        System.out.println(combined.transfoprmer(5));
    }
}
