package threads;




class Printer {
    private int state = 0; // 0: A, 1: B, 2: C
    private final int maxRounds;

    public Printer(int maxRounds) {
        this.maxRounds = maxRounds;
    }

    public void printA() {
        for (int i = 0; i < maxRounds; i++) {
            synchronized (this) { // current block of code locks the current object (this)
                while (state % 3 != 0) {
                    waitForTurn();
                }
                System.out.print("A ");
                state++;
                notifyAll();
            }
        }
    }

    public void printB() {
        for (int i = 0; i < maxRounds; i++) {
            synchronized (this) {
                while (state % 3 != 1) {
                    waitForTurn();
                }
                System.out.print("B ");
                state++;
                notifyAll();
            }
        }
    }

    public void printC() {
        for (int i = 0; i < maxRounds; i++) {
            synchronized (this) {
                while (state % 3 != 2) {
                    waitForTurn();
                }
                System.out.print("C ");
                state++;
                notifyAll();
            }
        }
    }

    private void waitForTurn() {
        try {
            wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class ABCPrint{
    public static void main(String[] args) {
        Printer printer = new Printer(5); // Print A B C 5 times

        Thread a = new Thread(printer::printA);
        Thread b = new Thread(printer::printB);
        Thread c = new Thread(printer::printC);

        a.start();
        b.start();
        c.start();
    }
}

