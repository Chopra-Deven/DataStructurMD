package MultiThreading.Thread;

import java.util.PriorityQueue;
import java.util.Queue;

class ProducerConsumer {

    final int capacity = 5;

    Queue<Integer> warehouse = new PriorityQueue<>();

    public synchronized void produce() {

        int value = 0;

        while (true) {

            synchronized (this) {

                if (warehouse.size() >= capacity) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                System.out.println("Producing...");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                for (int i = 0; i < capacity; i++) {

                    warehouse.add(++value);
                    notify();

                    if (warehouse.size() == capacity) {
                        System.out.println("Filled");
                    }

                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("Produced : " + warehouse);
                notify();

                try {
                    Thread.sleep(1000);
                    notify();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }

    }

    public synchronized void consume() {


        while (true) {

            synchronized (this) {

                if (warehouse.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                for (int i = 0; i < capacity; i++) {

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if (warehouse.size() == 0) {
                        notify();
                    }

                    System.out.println("Consumed : " + warehouse.poll());

                }

                notify();

            }


        }

    }


}

class DriverClass {

    public static void main(String[] args) {

        ProducerConsumer producerConsumer = new ProducerConsumer();

        Thread pThread = new Thread() {

            @Override
            public void run() {

                producerConsumer.produce();

            }
        };

        Thread cThread = new Thread() {

            @Override
            public void run() {

                producerConsumer.consume();
            }
        };

        pThread.start();
        cThread.start();

        try {
            pThread.join();
            cThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
