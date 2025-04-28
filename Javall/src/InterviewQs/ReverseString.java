package InterviewQs;
/*
reverse a string by keeping the special characters untouched
 */
public class ReverseString {

    static void usingStringBuilder(){
        String input="ram@ha$ri";

        StringBuilder letters=new StringBuilder();

        for(char c:input.toCharArray()){
            if(Character.isLetter(c)){
                letters.append(c);
            }
        }

        letters.reverse();

        StringBuilder result=new StringBuilder();
        int index=0;
        for(char c:input.toCharArray()){
            if(Character.isLetter(c)){
                result.append(letters.charAt(index++));
            }
            else{
                result.append(c);
            }
        }
        result.toString();
    }

    public static String reverseKeepingSpecialChars(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(chars[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(chars[right])) {
                right--;
            } else {
                // Swap the two letters/digits
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }


    public static void main(String[] args) {
        String input = "a,b$c";
        String result = reverseKeepingSpecialChars(input);
        System.out.println(result); // Output: "c,b$a"

    }
}
