package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {


    public static void insertion_sort(int[] arr, int size){

        int noofswap =0;
        for(int i=0;i<size;i++){
            int j= i;
            while(j>0 && arr[j-1]> arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j]= temp;
                noofswap++;
                j--;
            }
    
        }
        if(noofswap==0){
            System.out.println(" array is already sorted");

        }
    }

    public static void main(String []args){
        System.out.println(" enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println(" enter the elements of array");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
          arr[i] = sc.nextInt();

        }

        insertion_sort(arr,size);
        System.out.println(Arrays.toString(arr));
    }
}
