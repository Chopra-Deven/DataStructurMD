package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {


    public static void main(String[] args)
    {
        // Creating empty priority queue
        Queue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue
        // using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(7);
        pQueue.add(5);
        pQueue.add(12);
        pQueue.add(25);



        System.out.println("Queue : " + pQueue);
        // Printing the top element of
        // the PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());

        pQueue.remove();

        System.out.println(pQueue);
    }

}
