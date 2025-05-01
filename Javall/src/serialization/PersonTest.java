package serialization;

import java.io.*;

public class PersonTest {

    public static void main(String[] args){

        Person person1=new Person("sai",30,"hyd","anything");
        person1.email="mymail";

        //serializing the object to file
        try (ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("person1.ser"))){
            os.writeObject(person1);
            System.out.println("Serialized: "+person1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //deserialize the object from file
        try (ObjectInputStream is=new ObjectInputStream(new FileInputStream("person1.ser"))){
            Person deserializedPerson=(Person) is.readObject();
            System.out.println("Deserialized: "+deserializedPerson); //password will be null
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
