package MultiThreading.Thread;

import java.util.concurrent.atomic.AtomicInteger;

class VisibilityProblemSolved {
    static AtomicInteger counter = new AtomicInteger(10);

    public static void main(String[] args) {

        Thread readingThread = new Thread(() -> {

            while (true) {

                if (counter.get() == 11) {
                    System.out.println("Thread 1 Counter: " + counter.get());
                    break;
                }
            }
        });

        Thread modifyingThread = new Thread(() -> {

            System.out.println("Modifying Counter from " + counter.get() + " To " + counter.incrementAndGet());

        });

        readingThread.start();

        modifyingThread.start();
    }
}
