package designPatterns;
/*
The Singleton Design Pattern ensures that only one instance of a class is created throughout the application's lifecycle and provides a global
 point of access to it.

Private constructor prevents direct instantiation.
Static instance holds the single object.
Public static method returns the instance.

 */
class DesignPattern{
    private static DesignPattern instance;

    private DesignPattern(){
        System.out.println("object created");
    }

    public static DesignPattern getInstance(){
        if(instance==null){
            instance=new DesignPattern();
        }
        return instance;
    }

    public void test(String message) {
        System.out.println("test: " + message);
    }
}


public class Singleton {
        public static void main(String[] args){
            DesignPattern obj1=DesignPattern.getInstance();
            DesignPattern obj2=DesignPattern.getInstance();

            obj1.test("sai");
            obj2.test("kane");

            System.out.println(obj2==obj1); // only one object is created even though u create two objects

        }
}
