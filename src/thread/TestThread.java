package thread;

/**
 * Created by bvvy on 2017/6/30.
 */
public class TestThread {

    public static void main(String[] args) {
        Thread thread = new FirstThread();
        thread.start();
        Thread thread1 = new SecondThread();
        thread1.start();

        for(int i = 0;i<19;i++) {
            System.out.println("main" + i);
        }
    }
}

class FirstThread extends Thread {
    @Override
    public void run() {
       for(int i = 0;i<100;i++) {
           System.out.println("frist" + i);
       }
    }
}

class SecondThread extends Thread {
    @Override
    public void run() {
        for(int i = 0;i<20;i++) {
            System.out.println("second" + i);
        }
    }
}
