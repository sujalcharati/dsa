package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort_recursion {

    public static void insertionSortUsingRecursion(int[] arr, int size, int i){

        if( i == size) return ;

        int j = i;
        while (j > 0 && arr[j-1] > arr[j]) {
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
        insertionSortUsingRecursion(arr, size, i+1);
    }

    public static void main(String[] args) {
        System.out.println(" enter the size of array");
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        System.out.println(" enter the elemets of array");
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        int i=1;
        insertionSortUsingRecursion(arr,size,i);

        System.out.println(Arrays.toString(arr));
    }
    
}
