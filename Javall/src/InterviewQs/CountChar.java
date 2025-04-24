package InterviewQs;

import java.util.*;

public class CountChar {

    public static void main(String[] args){
        String str="No Normal in life";
        Map<Character,Integer> charMap=new HashMap<>();

        for(char ch:str.toCharArray()){
           if(ch==' ') continue;  // for skipping space
           charMap.put(ch,charMap.getOrDefault(ch,0)+1);

           /* if(charMap.containsKey(ch)){
                charMap.put(ch,charMap.get(ch)+1);
            }
            else{
                charMap.put(ch,1);
            }*/
        }

        for(Map.Entry<Character,Integer> entry:charMap.entrySet()){
            System.out.println("'"+entry.getKey()+"':"+entry.getValue());
        }
    }
}
