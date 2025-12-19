// finding maximum element/ peak element ...

// package binary_search;

// public class findPeakElement {

//     public static void main( String[] args){

//         int[] arr = { 1,2,1,3,5,6,4 };

//         int max = arr[0];
//         for( int i=0; i< arr.length-2;i++){
//             if( arr[i] < arr[i+1]){
//                 max = Math.max(max, arr[i+1]);

//             }
//         }

//         System.out.println(max);
//     }
    
// }


// finding maximum element's index with O(n):

package binary_search;

public class findPeakElement {

    public static void main( String[] args){

        int[] arr = { 1,2,1,3,5,6,4 };


        for( int i=0; i< arr.length;i++){
            if(( i==0 || arr[i-1] < arr[i]) && ( i == arr.length-1 || arr[i] > arr[i+1])){

                System.out.println(i);


            }
        }

    }
    
}

