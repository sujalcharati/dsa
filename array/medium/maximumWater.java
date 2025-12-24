// brute force method :

// package array.medium;

// import java.util.*;

// public class maximumWater {

//     public static int findMaxWater( int[] arr){

//         int max = Integer.MIN_VALUE;
//         for( int i=0; i< arr.length; i++){
//             for( int j=i+1; j< arr.length; j++){

//                 int min = Math.min( arr[i], arr[j]);
//                  max = Math.max(max, min*(j-i));
//             }
//         }

//         return max;
//     }

//     public static void main(String[] args){
     
//         int[] arr = { 1,8,6,2,5,4,8,3,7};
//         int val = findMaxWater(arr);
//         System.out.println(val);
//     }
    
// }



// optimal solution with two pointer:
package array.medium;

import java.util.*;

public class maximumWater {

    public static int findMaxWater( int[] arr){

        int left = 0;
        int right = arr.length-1;
        int max = Integer.MIN_VALUE;

        while( left < right){
            if( arr[left] <= arr[right]){
                 max = Math.max( max, arr[left]*(right-left));
                 left++;

            } else {
                max = Math.max(max, arr[right]*( right-left));
                right--;
            }
        }
        return max;
    }

    public static void main(String[] args){
     
        int[] arr = { 1,8,6,2,5,4,8,3,7};
        int val = findMaxWater(arr);
        System.out.println(val);
    }
    
}
