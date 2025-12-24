// time complexity with O(n);

// package binary_search;

// public class rotatedsortedarray0ne {

//     public static void main(String[] args){

//         int[] nums = {4,5,6,7,0,1,2};
//         int target = 0;
//         int found =0;

//         for( int i=0;i <nums.length;i++){
//             if( target == nums[i]){
//                 found =1;
    
//                 System.out.println(i);
                
//             }
//         }

//         if( found ==0) {
//             System.err.println("-1");
//         } 


//     }
    
// }


// time complexity with O( log n) with binary search :


package binary_search.on_1d_array;

public class rotatedsortedarray0ne {


    private static int searchRotatedArray(int[] nums, int target){

        int low =0;
        int high = nums.length-1;

        while( high >= low){
            int mid = ( low+high)/2;

            if(target == nums[mid]) return mid;

            if( nums[low] <= nums[mid]){

                if( target >= nums[low] && target < nums[mid]){
                    high= mid-1;
                } else low = mid+1;
                
            } else{
                if( target > nums[mid] && target <= nums[high]){
                    low = mid=1;
                } else high = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args){

        int[] nums = {4,5,6,7,0,1,2};
        int target =7;

        int ans = searchRotatedArray(nums,target);

        System.out.println(ans);


    }
    
}