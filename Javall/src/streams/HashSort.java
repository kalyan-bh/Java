package streams;
import java.util.*;
public class HashSort {

    static void sortByKey(HashMap<String,Integer> map){
        //sort keys using streams
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry->System.out.println(entry.getKey()+" : "+entry.getValue()));
    }

    static void sortByValue(HashMap<String,Integer> map){
        //sort values using streams
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry->System.out.println(entry.getKey()+" : "+entry.getValue()));
    }

    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("orange",23);
        hm.put("apple",15);
        hm.put("banana", 8);

        //sort by keys
        Map<String,Integer> sortedKeyMap=new TreeMap<>(hm);
        sortedKeyMap.forEach((k,v)->System.out.println(k+" : "+v));

        //sort by values
        List<Map.Entry<String,Integer>> list=new ArrayList<>(hm.entrySet());
        Collections.sort(list, (obj1,obj2)->obj1.getValue().compareTo(obj2.getValue()));
        /* //above implementation lambda backend expansion
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });
         */
        System.out.println(list);

        //sort keys by streams
        sortByKey(hm);

        //sort values using streams
        sortByValue(hm);
    }
}
