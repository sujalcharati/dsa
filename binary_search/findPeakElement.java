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

// package binary_search;

// public class findPeakElement {

//     public static void main( String[] args){

//         int[] arr = { 1,2,1,3,5,6,4 };


//         for( int i=0; i< arr.length;i++){
//             if(( i==0 || arr[i-1] < arr[i]) && ( i == arr.length-1 || arr[i] > arr[i+1])){

//                 System.out.println(i);


//             }
//         }

//     }
    
// }



// finding maximum element with O( log n):

package binary_search;

public class findPeakElement {


    public static int findPeakelement( int[] arr){

        int low = 1;
        int high = arr.length-2;

        if( arr.length == 1) return 0;

        if( arr[0] > arr[ 1]) return 0;
        
        if( arr[arr.length-1] > arr[arr.length-2]) return arr.length-1;

        while ( high >= low) {

            int mid = low+( high-low)/2;

            if( arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) return mid;
            else if( arr[mid] > arr[mid-1])  low = mid+1;
            else high = mid-1;
            
        }
        return -1;
    }

    public static void main( String[] args){

        int[] arr = { 1,2,1,3,5,6,4 };

        int val = findPeakelement( arr);
        System.out.println(val);

    }
    
}

