package threads;


class MyThread1 extends Thread {
    private final String name;

    public MyThread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread (extends Thread): " + name + " is running in " + Thread.currentThread().getName());
    }
}

class MyRun implements Runnable {
    private final String name;

    public MyRun(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread (implements Runnable): " + name + " is running in " + Thread.currentThread().getName());
    }
}

public class MyRunnable  {
    public static void main(String[] args){
        // Using Thread class
        MyThread1 t1 = new MyThread1("T1");
        MyThread1 t2 = new MyThread1("T2");

        // Using Runnable interface
        Thread t3 = new Thread(new MyRun("T3"));
        Thread t4 = new Thread(new MyRun("T4"));

        // STARTING THREADS
        System.out.println("Using start():");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // DIRECTLY CALLING run() — runs in MAIN thread, not new threads
        System.out.println("\nUsing run():");
        t1.run();
        t3.run();
    }
}
