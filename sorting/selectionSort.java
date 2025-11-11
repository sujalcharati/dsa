package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {

    public static void selection_sort(int[] arr, int size){

        for(int i=0;i<size-1;i++){
            int min = i;
            for(int j=i;j<size;j++){
                if( arr[j]< arr[min])  min=j;
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]= temp;
        }

    }
    public static void main(String []args){

        System.out.println(" enter the size of array");
        try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();

            System.out.println(" enter the elements");

            int[] arr = new int[size];
            for(int i=0;i<size;i++){

                 arr[i] = sc.nextInt();
            }

            selection_sort(arr, size);
            System.out.println(Arrays.toString(arr));
        }



    }
    
}
