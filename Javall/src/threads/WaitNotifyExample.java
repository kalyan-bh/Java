package threads;
/*
🔹 wait()
Called on an object.
Causes the current thread to pause and release the object's monitor (lock).
The thread enters the waiting state until another thread calls notify() or notifyAll() on the same object.
🔹 notify()
Also called on an object.
Wakes up one waiting thread that called wait() on the same object.
The awakened thread still needs to reacquire the lock before continuing.

🔐 Important Rules
Both wait() and notify() must be called inside a synchronized block.
They're methods of the Object class, not Thread.

 */
class SharedResource {
    synchronized void produce() throws InterruptedException {
        System.out.println("Producer is waiting...");
        wait();  // releases lock
        System.out.println("Producer resumed");
    }

    synchronized void consume() {
        System.out.println("Consumer is notifying...");
        notify();  // wakes up one thread waiting on this object
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            try {
                resource.produce();
            } catch (InterruptedException e) { }
        });

        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(1000);  // ensure producer waits first
                resource.consume();
            } catch (InterruptedException e) { }
        });

        producer.start();
        consumer.start();
    }
}

