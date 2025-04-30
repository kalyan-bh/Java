package threads;
/*
Print Even and Odd Numbers with Two Threads
One thread prints even numbers, the other prints odd numbers from 1 to N.
 */
class NumberPrinter{
    private int number=1;
    private final int N;

    public NumberPrinter(int N){
        this.N=N;
    }

    public synchronized void printOdd(){
        while (number<=N){
            if(number%2==1) {
                System.out.println("odd number: " + number);
                number++;
                notify(); // Wakes up one waiting thread that called wait() on the same object.
            }else {
                try{
                    wait();  //current thread to pause and release the object's monitor (lock).
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public synchronized void printEven(){
        while (number<=N){
            if(number%2==0){
                System.out.println("even number: "+ number);
                number++;
                notify();
            }
            else {
                try{
                    wait();
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

}


public class PrintEvenOdd {

    public static void main(String[] args){
        int N=10;
        NumberPrinter obj=new NumberPrinter(N);

        Thread oddThread=new Thread(new Runnable() {   // using annonymous inner class implementation
            @Override
            public void run() {
                obj.printOdd();
            }
        });

        Thread evenThread=new Thread(()->obj.printEven()); //using lambda

        oddThread.start();
        evenThread.start();

    }

}
