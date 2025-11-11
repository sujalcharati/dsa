package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {

    public static void bubble_Sort(int[] arr, int size){

        for(int i = size-1;i>=1; i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String args[]){
        System.out.println(" enter no of arrays");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println(" enter the elements");
        int[] arr = new int[size];
        for(int i =0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        bubble_Sort(arr, size);
        System.out.println(Arrays.toString(arr));

    }
    
}
