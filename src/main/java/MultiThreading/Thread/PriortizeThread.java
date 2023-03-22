package MultiThreading.Thread;

import java.util.ArrayList;


class MyThread1 extends Thread {

    @Override
    public void run() {

        Thread.currentThread().setName("Thread 1 : ##########");

        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName());

//            Thread.yield();

//            System.out.println("After Yield");


        }
    }
}


class MyThread2 extends Thread {

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

public class PriortizeThread {

    public static void main(String[] args) {

        MyThread1 thread1 = new MyThread1();

        MyThread2 thread2 = new MyThread2();

        thread2.setName("Child Thread");

       /* System.out.println(thread.getName());

        System.out.println(thread.getId());

        thread.setPriority(1);

        System.out.println(thread.getPriority());
*/
        thread2.setPriority(10);

        thread1.setPriority(1);

        thread2.start();

        thread1.start();

        for (int i = 0; i < 10; i++) {

            System.out.println("Main Thread : " + Thread.currentThread().getName());

        }

    }

}
