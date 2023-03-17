package Searching;

public class BinarySearch {

    public static int searchElement(int arr[], int element,int start, int end){

        if (end >= start){

            int mid = (start+end)/2;

            if (arr[mid] == element)
                return mid;

            else if (element < arr[mid])
                return searchElement(arr,element,start,mid-1);

            else
                return searchElement(arr,element,mid+1,end);

        }

        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {10,30,50,65,70,90};

        int index = BinarySearch.searchElement(arr,65,0, arr.length-1);

        if (index == -1)
            System.out.println("Element not Found!");
        else
            System.out.println("Element found at : " + index);

    }

}
