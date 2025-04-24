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

    static void amstrong(){
        int num=153,sum = 0,r;
        int original=num;
        int l=String.valueOf(num).length();
        while(num>0){
            r=num%10;
            sum+=Math.pow(r,l);
            num/=10;
        }

        if(sum==original){
            System.out.println(original+" is an amstrong");
        }
        else{
            System.out.println("not amstrong");
        }
    }

    static long factorial(int n){
        long res=1;
        for(int i=2;i<=n;i++){
            res*=i;
        }
        return res;
    }

    static long recur_fact(int n){
        if(n==0 || n==1) return 1;
        return n*recur_fact(n-1);
    }

    public static void main(String[] args){
        //fibonaci();
        //System.out.println(palindrom("NANAN"));
        //swap();
        //amstrong();
        //System.out.println(factorial(4));
        //System.out.println(recur_fact(5));
    }
}
