package Searching;

public class LinearSearch {

    public static int searchElement(int arr[], int element){

        int i;

        for (i=0 ; i< arr.length ; i++){

            if(arr[i] == element)
                return i;

        }

        return -1;

    }

    public static void main(String[] args) {

        int[] intArray = {2,3,4,5,6,7,10,4,2,1,4,7,9,0};
//        int[] intArray = { 3, 4, 1, 7, 5 };

        int i;

        int index = LinearSearch.searchElement(intArray,1);

        if (index == -1)
            System.out.println("Element not Found!!");
        else
            System.out.println("Element Found at : " + LinearSearch.searchElement(intArray,1));

    }

}
