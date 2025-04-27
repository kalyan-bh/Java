package lambda;
/*
Sorting with Lambda:
Given a list of Person objects (with name and age),
Sort the list by age using a lambda expression.
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class SortByAge {

    public static void main(String[] args){
        List<Person> people= Arrays.asList(
                new Person("suresh",35),
                new Person("ramesh",34),
                new Person("sai",24));
        //people.sort((p1,p2)->Integer.compare(p1.age, p2.age)); - two ways implementation
        people.sort(Comparator.comparingInt(p->p.age));
        System.out.println(people);
    }
}
