package Threading;

public class MultiThreading extends Thread implements Runnable{
    @Override
    public void run() {
        System.out.println("MultiThreading in interface class");
    }
    public void threading(){
        System.out.println("Threading is in Process");
    }
    public static void main(String args[]){
       MultiThreading thread= new MultiThreading();
       Thread New= new Thread(thread);
       thread.start();
    }
}
