package List;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListExample {

    public static void main(String[] args) {

        CustomArrayList<String> listOfString = new CustomArrayList<>("String");

        listOfString.add("0");

        listOfString.get();

        System.out.println("After adding one element capacity and count : " + listOfString.getCapacity() + " & " + listOfString.getCount());

        listOfString.add("1");

        listOfString.add("2");

        listOfString.add("3");

        listOfString.add("4");

        listOfString.add("5");

        listOfString.add("6");

        listOfString.add("7");

        listOfString.add("8");

        listOfString.add("9");

//        listOfString.add(10);

        listOfString.get();

        System.out.println("After adding one element capacity and count : " + listOfString.getCapacity() + " & " + listOfString.getCount());



    }
}
