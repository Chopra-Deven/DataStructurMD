package MultiThreading.Thread;


class MyThread extends Thread{

        @Override
        public void run() {

            for (int i=0 ; i<1000 ; i++){

                System.out.println("Child Thread");

            }

        }
}
public class ThreadCreationWay extends Thread{

    public static void main(String[] args) {

        MyThread childThread = new MyThread();

        childThread.start();

        for (int i=0 ; i<100 ; i++){

            System.out.println("Main Thread!!!!!!!!!!!!!!!!!!!!");

        }

    }

}
