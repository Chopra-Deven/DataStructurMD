package Map;

import java.util.HashMap;
import java.util.Map;

public class NetedMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> idNameMap = new HashMap<>();

        idNameMap.put(10, "Deven");
        idNameMap.put(20,"Jain");
        idNameMap.put(30, "Chopra");

        HashMap<Student, Map<Integer,String>> mainMap = new HashMap<Student, Map<Integer, String>>();

        mainMap.put(new Student("Deven", 100), idNameMap);

        for (Map.Entry entry : mainMap.entrySet()){

            HashMap<Integer,String > map = (HashMap<Integer, String>) entry.getValue();

            System.out.println(entry.hashCode());

            for (Map.Entry nMap : map.entrySet()){

                System.out.println(nMap.getKey() + " " + nMap.getValue());

            }

        }

    }

}
