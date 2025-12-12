
// very similar to case of problem - one of similar kind, the only difference is that we see here the duplicates due to which there is additional check of duplicates ... 

package binary_search;

public class rotatedsortedarrayTwo {

    private static boolean findElementByRotatedArray(int[] nums, int target){

        int low =0;
        int high = nums.length-1;

        while( low <= high){

            int mid = low+(high-low)/2;

            if( nums[mid] == target ) return true;
            if( nums[low] == nums[mid] && nums[mid] == nums[high]){
                low = low+1;
                high = high-1;
                continue;
            } else if( nums[low] <= nums[mid]){
                if( target >= nums[low] && target <= nums[mid]){
                    high = mid-1;
                } else low = mid+1;
            } else {
                if( target >= nums[mid] && target <= nums[high]){
                    low = mid+1;
                } else high = mid-1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        

        int[] nums = {2,5,6,0,0,1,2};
        int target = 4;

        boolean val = findElementByRotatedArray(nums,target);
        System.out.println(val);
    }
    
}
