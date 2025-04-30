package threads;
/*
Print Even and Odd Numbers with Two Threads, use reentrant lock and condition instead of synchronised
One thread prints even numbers, the other prints odd numbers from 1 to N.
 */
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class NumberPrint {
    private int number = 1;
    private final int N;
    private final Lock lock = new ReentrantLock(); //A ReentrantLock to enforce mutual exclusion.
    private final Condition condition = lock.newCondition(); //Condition object to manage thread coordination (await() and signal()).

    public NumberPrint(int N) {
        this.N = N;
    }

    public void printOdd() {
        while (true) {
            lock.lock(); // Acquires the lock,  locking the thread manuallly
            try {
                while (number <= N && number % 2 == 0) {
                    condition.await(); //If the number is not odd, it waits using condition.await()
                }
                if (number > N) break;
                System.out.println("Odd: " + number);
                number++;
                condition.signal();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            } finally {
                lock.unlock(); //Releases the lock.
            }
        }
    }

    public void printEven() {
        while (true) {
            lock.lock();
            try {
                while (number <= N && number % 2 == 1) {
                    condition.await();
                }
                if (number > N) break;
                System.out.println("Even: " + number);
                number++;
                condition.signal();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            } finally {
                lock.unlock();
            }
        }
    }
}

public class EvenOddReentrantExamp {
    public static void main(String[] args) {
        int N = 10;
        NumberPrint printer = new NumberPrint(N);

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();
    }
}
