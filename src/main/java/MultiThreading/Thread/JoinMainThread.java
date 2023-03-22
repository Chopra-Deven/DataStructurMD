package MultiThreading.Thread;

class MyThread3 extends Thread {

    @Override
    public void run() {

        Thread.currentThread().setName("Thread 1 : ##########");

        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName());



            try {
//                wait();
                sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

//            Thread.yield();

//            System.out.println("After Yield");


        }
    }
}


class MyThread4 extends Thread {

    @Override
    public void run() {

        Thread.currentThread().setName("Thread 2 ");

        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName());

//            Thread.yield();

//            System.out.println("After Yield");


        }
    }
}

public class JoinMainThread {

    public static void main(String[] args) throws InterruptedException {

        MyThread3 thread3 = new MyThread3();
        MyThread4 myThread4 = new MyThread4();

        thread3.start();

        thread3.join();

        myThread4.start();

    }

}
