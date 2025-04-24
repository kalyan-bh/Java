package basic;

public class MyThread extends Thread {

    @Override
    public void run(){
        System.out.println("in thread");
    }

    public static void main(String[] args){
        Thread t=new MyThread();
        t.start();
        System.out.println(t);
    }
}
