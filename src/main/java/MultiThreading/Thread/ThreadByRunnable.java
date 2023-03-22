package MultiThreading.Thread;

import java.sql.SQLOutput;

class RunnableThread implements Runnable{

    @Override
    public void run() {

        Thread.currentThread().setName("Child Thread ");

        for (int i=0 ; i<100 ; i++){

            System.out.println("Runnable Thread : " + Thread.currentThread().getName());

        }

    }
}

public class ThreadByRunnable {

    public static void main(String[] args) {

        RunnableThread runnableThread = new RunnableThread();

        Thread thread = new Thread(runnableThread);

        thread.start();

        for (int i=0 ; i<100 ; i++){

            System.out.println("Main Thread################# : " + Thread.currentThread().getName());

        }





    }
}
