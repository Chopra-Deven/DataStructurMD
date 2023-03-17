package List;

import java.util.*;


public class ArrayListSorting {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        arrayList.add(10);
        arrayList.add("abc");
//        arrayList.add(new Student(10, "Deven", 21));
        arrayList.add(10.0);

        ListIterator listIterator = arrayList.listIterator();

        while (listIterator.hasNext()){

            System.out.println(listIterator.next());

        }

//        System.out.println(Collections.binarySearch(arrayList,10));

//        Collections.sort(arrayList);

        ListIterator listIterator2 = arrayList.listIterator();

        while (listIterator.hasNext()){

            System.out.println(listIterator.next());

        }

    }

}
