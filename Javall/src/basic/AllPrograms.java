package basic;

import java.util.Scanner;

public class AllPrograms {

    public static void fibonaci(){
        int a=0,b=1,c,count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth value");
        count= sc.nextInt();
        for(int i=2;i<count;i++){
            c=a+b;            System.out.print(" "+c);
            a=b;
            b=c;
        }
        System.out.print("\n");
        sc.close();
    }

    public static boolean palindrom(String str){
        String rev=new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    static void swap(){
        int a=5,b=7;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+ " "+b);
    }

    public static void main(String[] args){
        //fibonaci();
        //System.out.println(palindrom("NANAN"));
        //swap();




    }
}
