package compareInterfaces;

import java.util.*;


public class DigitSort {
    public static void main(String[] args){

        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10>j%10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> nums= Arrays.asList(23,34,25,47,12,69,83);

        Collections.sort(nums,com);
        System.out.println(nums);
    }

}
