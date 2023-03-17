package Sorting;

public class BubbleSort {

    public static void display(int[] arr){

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");

    }

    public static void sorting(int[] arr){

        int n = arr.length;

        int temp = 0;

        for(int i=0; i < n; i++){

            System.out.println("Pass : " +i);

            display(arr);

            for(int j=1; j < (n-i); j++){

                if(arr[j-1] > arr[j]){

                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }


    }

    public static void main(String[] args) {

        int arr[] ={3,60,35,2,45,320,5};

        System.out.println("Array Before Bubble Sort");

        display(arr);

        sorting(arr);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");

        display(arr);

    }

}
