package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort_recursion {

    public static void bubbleSortUsingRecursion(int[] arr, int size){
        
        if(size ==1) return;
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i+1];
                arr[i+1]= arr[i];
                arr[i]= temp; 
            }
        }
        bubbleSortUsingRecursion(arr, size-1);
    }

    public static void main(String []args){

        System.out.println(" enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println(" enter the elements of array");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSortUsingRecursion(arr,size);

        System.out.println(Arrays.toString(arr));
    }
    
}
