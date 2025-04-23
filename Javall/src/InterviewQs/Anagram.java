package InterviewQs;

import java.util.Arrays;

public class Anagram {

    static boolean usingArray(String str1,String str2){
        char[] arr1= str1.replaceAll("\\s","").toLowerCase().toCharArray();
        char[] arr2=str2.replaceAll("\\s","").toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
/*
arr.equals(arr1) , Arrays.equals(arr, arr1) and arr == arr1  does not give same result
 */
        return  Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args){
        String str1="listen";
        String str2="silent";
        System.out.println(usingArray(str1,str2));
    }
}
