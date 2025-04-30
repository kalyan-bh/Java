package threads;

class MyTask extends Thread {
    private final String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " prority: "+getPriority() +" started in " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // pause for 2 seconds
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted.");
        }
        System.out.println(name + " finished.");
    }
}

public class MyThread {
    public static void main(String[] args) {

        MyTask t1 = new MyTask("Task-1");
        MyTask t2 = new MyTask("Task-2");

        t1.start(); // Start Task-1
        try {
            t1.join(); // Wait for t1 to finish before starting t2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start(); // Starts only after t1 completes

        System.out.println("Main thread finished.");
    }
}
