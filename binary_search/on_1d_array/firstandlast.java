// tried with this solution could not solve the edge cases :

// package binary_search;

// public class firstandlast {

//     public static int[] findFirstAndLast( int[] nums, int target){

//         int first = -1;
//         int last = -1;
//         int low =0;
//         int high = nums.length-1;

//         while( high >= low){
//             int mid = ( low+high)/2;

//             if( mid-1 != -1 && target == nums[mid]){
//                 if( nums[mid-1] == target){
//                     first = mid-1;
//                     last = mid;

//                     return new int[] {first,last};

//                 } else if( mid+1 != nums.length && nums[mid+1] == target){
//                     first= mid;
//                     last = mid+1;

//                     return new int[] { first,last};
//                 } else {
//                     first = mid;
//                     last = mid;
//                     return new int[] {first , last};
//                 }
//             } else if( nums[mid] > target){
//                  high = mid-1;
//             } else {
//                  low = mid+1;
//             }
//         }

//         return new int[] { first,last};
//     }

//     public static void main(String[] args) {
//         int[] nums = { 5,7, 7, 8 ,8, 10};
//         int target = 10;

//         int[] ans = findFirstAndLast( nums,target);

//         System.out.println(" first occerece is = "+ ans[0]+ " last occernece is = "+ ans[1]);
//     }
    
// }


// correct solutin with edge cases :

package binary_search.on_1d_array;

public class firstandlast {

    public static int[] findFirstAndLast( int[] nums, int target){

        int first = -1;
        int last = -1;
        int low =0;
        int high = nums.length-1;

        while( high >= low){
            int mid = ( low+high)/2;

            if( nums[mid] == target){
                first = mid;
                high = mid-1;
            } else if( nums[mid] > target){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

         low =0 ;
         high = nums.length-1;

        while (  high >= low) {

            int mid = low+ (high - low)/2;

            if( nums[mid] == target){
                last = mid;
                low = mid+1;
            } else if( target > nums[mid]) low = mid+1;
              else high = mid -1 ;
            
        }

        return new int[] { first,last};
    }

    public static void main(String[] args) {
        int[] nums = { 5,7, 7, 8 ,8, 10};
        int target = 5;

        int[] ans = findFirstAndLast( nums,target);

        System.out.println(" first occerece is = "+ ans[0]+ " last occernece is = "+ ans[1]);
    }
    
}


