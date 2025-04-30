package threads;

class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hi");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



public class HiHello {

    public static void main(String[] args){

        Thread t1=new A();
        Thread t2=new B();

        t1.start();
        t2.start();

        System.out.println(t1.getName() +", "+ t1.getPriority() +", "+t1.getThreadGroup());
        System.out.println(t2.getName() +", "+ t2.getPriority() +", "+t2.getThreadGroup());
    }
}
