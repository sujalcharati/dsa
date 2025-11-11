package sorting;

import java.util.Arrays;
import java.util.Scanner;
  



public class quickSort { 
    
   public static int findPivotPlace(int[] arr , int low, int high){
    int pivot = arr[low];
    int i = low;
    int j = high;
    while ( i < j) {
      
        while ( i <= high && arr[i] <= pivot ) {
            i++;
        }
        while ( j >= low && arr[j] > pivot) {
             j--;
        }
        if( i < j){
            int temp = arr[j];
             arr[j] = arr[i];
             arr[i] = temp;
        }
    }

    // Swap pivot with element at position j
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;
    return j;

   }
    public static void quickSortSort(int[] arr, int low, int high){
        if (low < high){

        int pivot_index = findPivotPlace(arr,low, high);
        quickSortSort(arr, low, pivot_index-1);
        quickSortSort(arr, pivot_index+1, high);
        }
    }

    public static void main(String[] args) {
        System.out.println(" enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println(" enter the elements of array");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = size-1;
        quickSortSort(arr,low,high);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    
}
