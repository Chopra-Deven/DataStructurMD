package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Student {

    String studentName;
    int studentId;
//    int studentRn;

    Student(String name, int id){

        this.studentName = name;
        this.studentId = id;
//        this.studentRn = rn;

    }

}

public class HashMapExample {

    public static String getValueForStudentId(int studentId, HashMap<Student, String> studentMap) {

        for (Map.Entry<Student, String> entry : studentMap.entrySet()){

            if (entry.getKey().studentId == studentId){
                return entry.getValue();
            }

        }

        return null;
    }


    public static void main(String[] args) {

        HashMap<Student, String > sMap = new HashMap<>();

        sMap.put(new Student("Deven", 100), "Deven Student");

        sMap.put(new Student("Digu", 200), "Digu Student");
        sMap.put(new Student("Khus", 300), "Khus Student");
        sMap.put(new Student("Jay", 400), "Jay Student");

        System.out.println(HashMapExample.getValueForStudentId(300,sMap));

        for (Map.Entry map : sMap.entrySet()){

            System.out.println(map.hashCode());


        }


    }

}
