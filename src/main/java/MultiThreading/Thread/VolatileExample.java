package MultiThreading.Thread;
/*
public class VolatileExample extends Thread{

    private static  int counter = 0;

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            int localCounter = counter;

            while(localCounter < 10){

                if (localCounter != counter){

                    System.out.println("Thread - 1 : Local Counter is changed");
                    localCounter = counter;

                }

            }

        });

        Thread t2 = new Thread(() -> {

           int localCounter = counter;

           while (localCounter < 10){

               System.out.println("Thread - 2 increamented counter to : " + localCounter + 1);
               counter = ++ localCounter;

           }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        t1.start();
        t2.start();

    }

}*/

class VisibilityProblem {
    private static int counter = 10;

    public static void main(String[] args) {
        Thread readingThread = new Thread(() -> {
            int i = 0;
            while (i < 5) {
                if (counter == 11) {
                    System.out.println("Counter: " + counter);
                    break;
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                i++;
            }
        });
        Thread modifyingThread = new Thread(() -> {
            System.out.print("Modifying Counter from " + counter);
            counter++;
            System.out.println(" To " + counter);
        });
        readingThread.start();
        modifyingThread.start();
    }
}
