package MultiThreads;

public class Threads extends Thread {
    @Override
    public void run() {
        System.out.println("Extend from thread");
    }

    public static void main (String [] args){
        Threads thread = new Threads();
        thread.start();
    }
}
