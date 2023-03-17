package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample extends Thread{

    static ConcurrentHashMap<Integer, String> cMap = new ConcurrentHashMap();

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Child thread ");

        cMap.put(103, "C");

    }

    public static void main(String[] args) throws InterruptedException {

        cMap.put(101, "A");

        cMap.put(102, "B");

        ConcurrentHashMapExample thread = new ConcurrentHashMapExample();

        thread.start();

        for(Map.Entry entry : cMap.entrySet()){

            System.out.println("Main Thread");

            System.out.println(entry.getKey() + " " + entry.getValue());

            Thread.sleep(2000);

        }

        System.out.println(cMap);

    }
}
