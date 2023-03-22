package MultiThreading.Thread;

class Display{

    public static synchronized void display1(){

        for (int i=0 ; i<10 ; i++){

            System.out.println("1st Display : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public static synchronized void display2(){

        for (int i=0 ; i<10 ; i++){

            System.out.println("2nd Display : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

    public synchronized void display3(){

        for (int i=0 ; i<10 ; i++){

            System.out.println("3rd Display : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }

}

class Thread1 extends Thread{

    Display obj;

    Thread1(Display obj){

        this.obj = obj;

    }

    @Override
    public void run() {

        obj.display1();

    }
}

class Thread2 extends Thread{

    Display obj;

    Thread2(Display obj){

        this.obj = obj;

    }

    @Override
    public void run() {

        obj.display2();

    }
}

class Thread3 extends Thread{

    Display obj;

    Thread3(Display obj){

        this.obj = obj;

    }

    @Override
    public void run() {

        obj.display3();

    }
}

public class StaticSynchLock {

    public static void main(String[] args) {

        Display d1 = new Display();

        Display d2 = new Display();

        Thread1 t1 = new Thread1(d1);

        Thread2 t2 = new Thread2(d2);

        Thread3 t3 = new Thread3(d2);

        t1.start();

        t2.start();

        t3.start();
    }

}
