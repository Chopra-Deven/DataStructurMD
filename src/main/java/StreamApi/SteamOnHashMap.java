package StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class SteamOnHashMap {

    public Map<Integer, List<Integer>> modifyMap(Map<Integer, List<Integer>> map){
        return map.entrySet().stream().filter(entry -> entry.getKey() % 2 == 0).collect(Collectors.toMap(Map.Entry::getKey, s -> s.getValue().stream().filter(value -> value % 2 != 0).collect(Collectors.toList())));
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> map;

        map = new HashMap<>();

        int i, j;

        for (i = 1; i <= 10; i++) {

            List<Integer> intList = new ArrayList<>();

            for (j = 1; j <= 10; j++) {

                intList.add(j);

            }

            map.put(i, intList);

        }

        System.out.println("Input Map : \n");

        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()){

            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

        System.out.println("\nAfter Filtering\n");


        Map<Integer,List<Integer>> updatedMap = new SteamOnHashMap().modifyMap(map);

        System.out.println(updatedMap);

    }

}