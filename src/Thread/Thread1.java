package Thread;

public class Thread1 extends Thread {

    public void run() {

        for(int i =0; i<1000; i++)
            System.out.println("Thread1"+i+" ");
    }
}
