package InterviewQs;

import java.util.*;

public class First3NonRepeatChars {

    static void usingMap(){
        String str="aeroplane";

        //Step 1 count characters with how many times it is repeating
        LinkedHashMap<Character,Integer> countMap=new LinkedHashMap<>();
        for(char c: str.toCharArray()){
            if(countMap.containsKey(c)){
                countMap.put(c,countMap.get(c)+1);
            }
            else{
                countMap.put(c,1);
            }
        }

        //step 2 get first 3 non-repeating characters
        List<Character> f3nrl=new ArrayList<>();
        for(char c:countMap.keySet()){
            if(countMap.get(c)==1){
                f3nrl.add(c);
                if(f3nrl.size()==3) break;
            }
        }
        System.out.println(f3nrl);
    }

    static void usingStreamAPI(){
        String str="practice more";

    }


    public static void main(String[] args){
        //usingMap();
        //usingStreamAPI();
    }
}
