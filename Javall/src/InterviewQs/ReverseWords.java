package InterviewQs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWords {

    static void usingCollections(){
        String sentence="java eight features are important";
        String[] arr=sentence.split(" ");
        List<String> wordsList= Arrays.asList(arr);
        List<String> newls=new ArrayList<>();
        for(String s:wordsList){
            newls.add(new StringBuilder(s).reverse().toString());
        }
        System.out.println(String.join(" ",newls));
    }

    static void usingStreams(){

    }

    public static void main(String[] args){
        usingStreams();
        usingCollections();
    }
}
