// simple method :

// package binary_search;

// public class searchInsertPosition {

//     public static int findSearchInsert(int[] nums, int target){

//          int i;

//          if( target <= nums[0]) return 0;
//         for( i=0; i< nums.length-1;i++){
//             if( nums[i] == target) return i;
//             else if( nums[i] < target && nums[i+1] > target) return i+1;
            
//         }

//         if( nums[nums.length-1] == target ) return nums.length-1;
//         else {
//             return nums.length;
//         }

//     }

//     public static void main(String[] args){

//         int[] nums = { 1,3,5,7};
//         int target = 4;

//         int val = findSearchInsert(nums,target);
//         System.out.println(val);
       
//     }
    
// }



// using binary search 


package binary_search.on_1d_array;

public class searchInsertPosition {

    public static int findSearchInsert(int[] nums, int target){

        int low =0;
        int high = nums.length-1;
        int ans = nums.length;

        while ( high >= low) {

            int mid = (low+high)/ 2;

            if( nums[mid] >= target){
                ans = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }

          
            
        }
        return ans;

    }

    public static void main(String[] args){

        int[] nums = { 1,3,5,7};
        int target = 2;

        int val = findSearchInsert(nums,target);
        System.out.println(val);
       
    }
    
}

