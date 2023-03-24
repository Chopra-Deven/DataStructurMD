package MultiThreading.Thread;

import java.util.PriorityQueue;
import java.util.Queue;

public class ProducerConsumer2 {

    Queue<Integer> wareHouse = new PriorityQueue<>();

    final int capacity = 5;

    public void produce() throws InterruptedException {
        int value = 1;

        while (true) {
            synchronized (this) {
                // producer thread waits while list
                // is full
                while (wareHouse.size() == capacity) wait();

                System.out.println("Producer produced : " + value);

                // to insert the jobs in the list
                wareHouse.add(value++);

                // notifies the consumer thread that
                // now it can start consuming
                notify();

                // makes the working of program easier
                // to  understand
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {

        while (true) {

            synchronized (this) {
                // consumer thread waits while list
                // is empty
                while (wareHouse.size() == 0) wait();

                // to retrieve the first job in the list
                int val = wareHouse.poll();

                System.out.println("Consumer consumed : " + val);

                // Wake up producer thread
                notify();

                // and sleep
                Thread.sleep(1000);
            }
        }
    }
}

class Controller {

    public static void main(String[] args) {

        ProducerConsumer2 producerConsumer = new ProducerConsumer2();

        Thread pThread = new Thread() {

            @Override
            public void run() {

                try {
                    producerConsumer.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };

        Thread cThread = new Thread() {

            @Override
            public void run() {

                try {
                    producerConsumer.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
             }
        };

        pThread.start();
        cThread.start();

       /* try {
            pThread.join();
            cThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
*/

    }

}