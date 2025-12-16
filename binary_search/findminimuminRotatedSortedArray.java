// time compelxity with O( n ):

// package binary_search;
// import java.util.*;

// public class findminimuminRotatedSortedArray {

//     public static int findMinimum( int[] arr){

//         int min = Integer.MAX_VALUE;
        
//         for( int i=0; i< arr.length; i++){
//             min = Math.min(min, arr[i]);
//         }
//         return min;
//     }


//     public static void main( String[] args ){

//         int[] arr = { 11,13,15,17};

//         int val = findMinimum(arr);
//         System.out.println(val);
//     }
    
// }



// time complexity with 0( log n):

package binary_search;
import java.util.*;

public class findminimuminRotatedSortedArray {

    public static int findMinimum( int[] arr){

        int low = 0;
        int high = arr.length-1;
        int min = Integer.MAX_VALUE;

        while( high >= low){
            int mid = low +( high-low)/2;

            if( arr[low] <= arr[mid]){
                min = Math.min(min, arr[low]);
                low = mid+1;

            }else {
                  high = mid-1;
                  min = Math.min(min, arr[mid]);
            }
        }
        return min;
    }


    public static void main( String[] args ){

        int[] arr = { 3,4,5,1,2};

        int val = findMinimum(arr);
        System.out.println(val);
    }
    
}
