package compareInterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person>{

    String name;
    int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person obj) {
        return this.name.compareTo(obj.name);
        //return this.age-obj.age;  // sort by age, for primitive type we cannot use like above

        /*
        // Sorting Person by age, then by name if age is the same.
        int ageCompare=Integer.compare(this.age,obj.age);
        return (ageCompare !=0 )? ageCompare : this.name.compareTo(obj.name);
        */
    }


    public static void main(String[] args){
        List<Person> people= Arrays.asList(new Person("sai",56),new Person("bob",36),
                new Person("rachel",35),new Person("sania",43));
        Collections.sort(people);
        System.out.println(people);
        Collections.sort(people,Collections.reverseOrder());
        System.out.println(people);
    }
}



