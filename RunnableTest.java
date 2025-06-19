import java.util.*;

class RunnableTest{
    public static void main(String[] args) {
        thr t = new thr();
        Thread t1=new Thread(t);
        t1.start();
    }
}

class thr implements Runnable{
    public void run() {
        System.out.println("Thread is running");
    }
}