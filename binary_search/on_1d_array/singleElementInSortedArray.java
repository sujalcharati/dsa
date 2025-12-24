// brute force approach ...

// package binary_search;

// public class singleElementInSortedArray {

//     public static int findSingleElement( int[] nums){

//         for( int i=0; i< nums.length;i++){
//             if( i ==0){
//                  if( nums[i] != nums[i+1]) return nums[i];
//             } else if ( i == nums.length-1){
//                 if( nums[i] != nums[i-1]) return nums[i];
//             } else {
//                 if( nums[i] != nums[i-1] && nums[i] != nums[i+1]) return nums[i];
//             }
//         }

//         return 0;
//     }

//     public static void main(String[] args) {
//        int[] nums = {1,1,2,3,3,4,4,8,8};

//        int val = findSingleElement( nums);
//        System.out.println(val);
//     }
    
// }




// binary search O( log n )

package binary_search.on_1d_array;

public class singleElementInSortedArray {

    public static int findSingleElement( int[] nums){
       int n = nums.length;
       int low =1;
       int high = n-2;

       if( n ==1) return nums[0];
       if( nums[0] != nums[1]) return nums[0];
       if( nums[n-1] != nums[n-2]) return nums[n-1];

       while( high >= low){

        int mid = low+( high -low)/2;

        if( nums[mid] != nums[mid+1 ] && nums[mid] != nums[mid-1]) return nums[mid];

        if( (mid %2 == 0 && nums[mid+1] == nums[mid]) || mid%2 == 1 && nums[mid-1] == nums[mid]) low = mid+1;
        else high = mid-1;
         

       }

        return 0;
    }

    public static void main(String[] args) {
       int[] nums = {1,1,2,3,3,4,4,8,8};

       int val = findSingleElement( nums);
       System.out.println(val);
    }
    
}