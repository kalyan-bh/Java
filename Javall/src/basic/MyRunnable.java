package basic;

public class MyRunnable implements Runnable {

    @Override
    public void run(){
        System.out.println("Thread is running "+Thread.currentThread().getName());
    }

    public static void main(String[] args){
        MyRunnable mr=new MyRunnable();
        Thread t=new Thread(mr);
        t.start();
    }
}
