package compareInterfaces;

import java.util.Arrays;

/*
largest possible integer out of the array of numbers
 */
public class LargestInteger {

    public static String largestNumber(int[] nums) {
        // Convert int[] to String[]
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Sort using custom comparator
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        // Handle case where the largest number is 0 (e.g., [0, 0])
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Build the final number
        StringBuilder result = new StringBuilder();
        for (String num : strNums) {
            result.append(num);
        }

        return result.toString();
    }

    public static void main(String[] args){
        int[] nums={2,34,23,67,98};
        System.out.println("Largest number: " + largestNumber(nums));
    }
}
