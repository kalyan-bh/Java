package streams;
import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElements{


    public static void main(String[] args){
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");


        Set<String> duplicates=items.stream()
                .collect(Collectors.groupingBy(item->item,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println("Duplicate elements: "+duplicates);

    }
}
