package serialization;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID=1L;

    String name;
    int age;
    String address;
    String email;

    transient String password;

    public Person(String name,int age,String address,String password){
        this.name=name;
        this.age=age;
        this.address=address;
        this.password=password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
