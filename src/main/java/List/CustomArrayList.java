package List;

import java.util.Collection;

public class CustomArrayList <T>  {

    T obj;

    private int capacity = 5;

    Object[] objectElements;

    private int size;

    private int count;

    CustomArrayList(T obj){

        this.obj = obj;

        objectElements = new Object[capacity];

        count = 0;

        size = objectElements.length;

    }

    public void add(T obj){

        if(count >= capacity){

            growSize();

        }

        objectElements[count++] = obj;

    }

    private void growSize() {

        Object temp[] = null;

        if (count == capacity){

            capacity = (int) ((capacity * 1.5) + 1);

            temp = new Object[(int) capacity];

            for (int index=0 ; index < objectElements.length ; index++){

                temp[index] = objectElements[index];

            }

            objectElements = temp;

        }

    }

    public void get(){

        for(int index=0 ; index<count ; index++){

            System.out.println("list["+ index +"] : " + objectElements[index]);

        }

    }

    public int getCapacity(){
        return capacity;
    }

    public int getCount(){
        return count;
    }

}
