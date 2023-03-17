package Map;

import java.util.HashMap;

class MyStudent{
    int id;
    String name;

    public MyStudent(int id) {
        this.id = id;
    }

    public MyStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        System.out.println(this.getClass().getName());
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(this.getClass().getName()+"....."+obj.getClass().getName());
        return true;
    }
}
public class HashMapApplication {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();

        MyStudent myStudent = new MyStudent(30,"Manas");

        System.out.println("\n\n\n");
        hashMap.put(myStudent, 50);
        hashMap.put(new MyStudent(20,"Deven"),40);

        System.out.println(hashMap.get(new MyStudent(50)));


    }

}
