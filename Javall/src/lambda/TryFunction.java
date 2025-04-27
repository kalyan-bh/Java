package lambda;

@FunctionalInterface
interface Tri<T,U,V,R>{
    R apply(T t,U u,V v);
}


public class TryFunction {
    public static void main(String[] args){
        Tri<Integer,Integer,Integer,Double> average=(a,b,c)->(a+b+c)/3.0;
        System.out.println(average.apply(4,5,6));
    }
}
