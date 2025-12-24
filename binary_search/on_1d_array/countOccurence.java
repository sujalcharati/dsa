// normal method to figure out :

// package binary_search;

// public class countOccurence {

//     public static void main( String[] args){
//         int[] arr = {5,5,5,5,5,5,5}; 
//         int target = 5;
//         int count =0;

//         for( int i=0;i<arr.length;i++){
//             if( target == arr[i]){
//                 count+=1;
//             }
//         }

//         System.out.println(count);
//     }
    
// }



// figure out with binary search :


package binary_search.on_1d_array;

import java.util.Arrays;

public class countOccurence {

    private static int firstOccurence( int[] arr , int target){
        int high = arr.length-1;
        int low =0;
        int first=-1;

        while( high >= low){
          int mid = low+ (high- low)/2;

          if( target == arr[mid]){
                first = mid;
                high = mid-1;
          } else if( target > arr[mid]){
               low = mid+1;
          } else {
              high = mid-1;
          }
        }

        return first;
    }


     private static int lastOccurence( int[] arr , int target){
        int high = arr.length-1;
        int low =0;
        int last=-1;

        while( high >= low){
          int mid = low+ (high- low)/2;

          if( target == arr[mid]){
                last = mid;
                low = mid+1;
          } else if( target > arr[mid]){
               low = mid+1;
          } else {
              high = mid-1;
          }
        }

        return last;
    }


    private static int[] count( int[] arr, int target){

        int first = firstOccurence(arr,target);
        if( first == -1) return new int[] {-1,-1};
        int last = lastOccurence(arr,target);

        return new int[] {first,last};

    }

    public static void main( String[] args){
        int[] arr = {5,5,5,5,5,5,5}; 
        int target = 5;

        int[] ans = count(arr,target);

        System.out.println(Arrays.toString(ans));
        System.out.println();
       
    }
    
}
