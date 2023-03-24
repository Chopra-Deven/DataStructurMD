package MultiThreading.Thread;

import java.util.concurrent.locks.Lock;

class DeamonThread extends Thread{
    public void run(){
        System.out.println("Name: "+Thread.currentThread().getName());
        System.out.println("Daemon: "+Thread.currentThread().isDaemon());
    }

    public static void main(String[] args){
        DeamonThread t1 = new DeamonThread();
        DeamonThread t2 = new DeamonThread();

        t1.setDaemon(true);

        t1.start();

        //will throw exception here
        t2.start();


    }
}

