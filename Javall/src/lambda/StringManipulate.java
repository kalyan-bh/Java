package lambda;

@FunctionalInterface
interface Manipulate{
    String modify(String s);
}


public class StringManipulate {


    public static void main(String[] args){
        Manipulate upper=s->s.toUpperCase();
        Manipulate reverse=s->new StringBuilder(s).reverse().toString();
        Manipulate removeSpace=s->s.replaceAll("\\s","");

        System.out.println(upper.modify("kalyan"));
        System.out.println(reverse.modify("nothing"));
        System.out.println(removeSpace.modify("this is me"));
    }
}
