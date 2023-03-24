package MultiThreading.Thread;

public class TestThread extends Thread {

   /* private int counter = 0;
    @Override
    public void run() {

        counter++;
    }
*/
    public static void main(String[] args) throws InterruptedException {

       TestThread thread = new TestThread();

//        thread.run();

        thread.start();

//        thread.join();

        System.out.println("Program");

    }
}

