// time comp : O( n ):

// package binary_search;

// public class howManyTimes {

//     public static void main(String[] args) {
//         int[] arr = { 4, 5, 1, 2};

//         for( int i=0; i< arr.length-1;i++){

//             if( arr[i] > arr[i+1]) {
//                 int val = i+1;
//                 System.out.println("The array has rotated for "+ val +" time");
//             }
//         }


//     }
    
// }

// time complexity : O( log n):


package binary_search.on_1d_array;

public class howManyTimes {

    public static int findHowManyTimes( int[] arr){

        int low = 0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;

        while( high >= low){
            int mid = low + (high-low)/2;

            if( arr[low] <= arr[high]){
                if( arr[low] <ans ){
                    index = low;
                    ans = arr[low];
                }
                break;
            }

            if( arr[low] <= arr[mid]){
                index =low;
                ans = arr[low];
                low = mid+1;
            } else {
                index = mid;
                ans = arr[mid];
                high = mid -1;
            }
            
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2};

        int val = findHowManyTimes( arr);
        System.out.println(val);


    }
    
}