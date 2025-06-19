import java.util.*;

class NoOrphan{
    public static void main(String[] args) {
        child t = new child();
        t.start();
        try{
            t.join();
        }catch (Exception e){
            System.out.println("main thread Interrupted");
        }
        System.out.println("Main thread exited after child thread");
    }
}

class child extends Thread{
    public void run(){
        try{
            Thread.sleep(3000);
        }
        catch (Exception e) {
        System.out.println("Child got interrupted");
        }
        System.out.println("Child thread done");
    }
}

