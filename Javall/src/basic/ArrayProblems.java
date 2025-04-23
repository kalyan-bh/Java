package basic;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblems {



    static void duplicateElements() {
            int[] arr= {1,2,3,1,2,5,6,7,4,6,9,8};
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        System.out.println("Duplicate Element:"+ arr[i]);
                    }
                }
            }
    }

    static void outputQ1(){
        int i=0;
        int j=i;
        j=i++ +j;
        System.out.println(i+"-"+j);
    }

    static void arrMethods(){
        int arr1[]={1,43,53,2,56,53,64};
        int arr2[];
        arr2=Arrays.copyOf(arr1,arr1.length);
        for (int i=0;i<arr2.length;i++){
            System.out.print(" "+arr2[i]);
        }
        Arrays.fill(arr2,100);
        System.out.println("\n Arrays after filling");
        for (int i=0;i<arr2.length;i++){
            System.out.print(" "+arr2[i]);
        }
        int[] nArray=Arrays.copyOfRange(arr1,2,5);
        System.out.println("\n printing nArray");
        for (int i=0;i<nArray.length;i++){
            System.out.print(" "+nArray[i]);
        }
    }

    static void arrSearch(){
        int arr[] = {44,3,63,15,77,56};
        int number = 0;
        int index = 0;
        Scanner scInput = new Scanner(System.in);
        System.out.print("Enter number to be searched: ");
        number = scInput.nextInt();
        System.out.println("Array before sorting");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        int idx1=Arrays.binarySearch(arr,number);
        System.out.println("\n index before sorting "+idx1);
        Arrays.sort(arr);
        System.out.println("\nArray after sorting");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        index = Arrays.binarySearch(arr, number);
        if(index < 0){
            System.out.println("Number not found.");
        }
        else{
            System.out.println("Number found at position " + index);
        }
        scInput.close();
    }




    public static void main(String[] args){
        //duplicateElements();
        //outputQ1();
        //arrMethods();
       //arrSearch();

        }
    }


/*
        int a[]; int []b; int[] c;
        a = new int[5];
        int a[] = {1,34,56,31};//Cannot be done after declaration is over.
        int []b;
        int[] c;
        a = new int[5]; //Method 1 of defining array
        a = new int[] {1,34,56,31}; //Method 2 of defining array
        a = {1,34,56,31};//Not permissible. Allowed only at declaration.

        */
