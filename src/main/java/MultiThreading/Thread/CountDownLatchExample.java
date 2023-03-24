package MultiThreading.Thread;


import java.util.concurrent.CountDownLatch;

class Child implements Runnable {

    CountDownLatch latch;

    Child(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " is waked");

        System.out.println(Thread.currentThread().getName() + " is getting ready");

        System.out.println(Thread.currentThread().getName() + " is Left");

        latch.countDown();

    }

}

public class CountDownLatchExample {


    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(3);

        Thread t1 = new Thread(new Child(latch),"Raj");

        Thread t2 = new Thread(new Child(latch),"Vijay");

        Thread t3 = new Thread(new Child(latch),"Het");

        t1.start();
        t2.start();
        t3.start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\nAll Threads are executed");


    }
}
