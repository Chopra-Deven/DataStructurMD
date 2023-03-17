package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(4);
        list.add(10);
        list.add(23);
        list.add(12);
        list.add(16);

        List<Integer> listOfEven = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());

//        list.stream().forEach(s-> System.out.println(s));

        list.stream().forEachOrdered(System.out::println);



    }

}
