package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {

    public static void merge(int[] arr, int size, int low, int mid, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while( left <= mid && right <= high){
            if(arr[left]<= arr[right]){
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            };
        }

        while( left<= mid){
            list.add(arr[left]);
            left++;
        }

        while (right <= high) {
           list.add(arr[right]);
           right++;            
        }


        for(int i=low; i<=high; i++){
            arr[i] = list.get(i - low);
        }
    }

    public static void merge_sort(int[] arr , int size, int low, int high) {
         
        if( low >= high) return;
        int mid = low+(high-low)/2;
        merge_sort(arr, size, low, mid);
        merge_sort(arr, size, mid+1, high);
        merge(arr, size, low, mid, high);
    }
    public static void main(String[] args) {
        System.out.println(" enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println(" enter the elements of array");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }

        int low = 0;
        int high = size - 1;

        merge_sort(arr, size, low, high);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    
}
