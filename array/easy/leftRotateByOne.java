package array.easy;

import java.util.ArrayList;
import java.util.Arrays;

import maths.armstrong;
import maths.reverse_number;

// public class leftRotateByOne {

//     public static void main(String[] args) {
//         int[] arr = { 1,3,4,5,6};
//         int first = arr[0];
//         int i;
//         for( i=0;i < arr.length-1; i++){
//             arr[i]= arr[i+1];
//         }
//         arr[arr.length-1] = first;
//         for(int j=0;j <arr.length;j++){

//             System.out.print(arr[j]);
//         }

//     }
    
// }



// d number of roations...


// public class leftRotateByOne {

//     public static void main(String[] args) {
//         int[] arr = { 1,3,4,5,6};
//         int i;
//         for(int j=0;j<2;j++){
//             int first = arr[0];

//             for( i=0;i < arr.length-1; i++){
//                 arr[i]= arr[i+1];
//             }
//             arr[arr.length-1] = first;
//         }
//         for(int j=0;j <arr.length;j++){

//             System.out.print(arr[j]);
//         }

//     }
    
// }


// d number of rotations with brute force and optimal solutions :


// a: brute force one 

// public class leftRotateByOne {
    
//     static void leftRotation( int[] arr , int d,int n){

//         ArrayList<Integer> list = new ArrayList<>();

//         for(int i=0; i<d;i++){
//             list.add(arr[i]);
//         }

//         for( int i = d; i< n; i++){
//             arr[i-d]= arr[i];

//         }

//         for(int i=n-d; i<n;i++){
//             arr[i]=list.get(i-(n-d));

//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = { 1,3,4,5,6};
//         int d = 3;
//         int n = arr.length;
//         leftRotation(arr, d,n);
//         System.out.println(Arrays.toString(arr));

//     }
    
// }



// b: optimal :

public class leftRotateByOne {

    static void reverse(int[] arr, int start, int end){

        while( start <= end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;

        }

    }
    
    static void leftRotation( int[] arr , int d,int n){
       int start =0;
       reverse(arr, start, d-1);
       reverse(arr, d,n-1);
       reverse(arr, start, n-1);

    }

    
    public static void main(String[] args) {
        int[] arr = { 1,3,4,5,6};
        int d = 3;
        int n = arr.length;
        leftRotation(arr, d,n);
        System.out.println(Arrays.toString(arr));

    }
    
}
