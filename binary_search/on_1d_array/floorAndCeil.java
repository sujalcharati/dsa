package binary_search.on_1d_array;

public class floorAndCeil {


    public static int[] findFloorCeil(int[] nums, int target){

       int ceil = -1; 
       int floor = -1;
       int low =0;
       int high = nums.length-1;

       while(  high >= low){

        int mid = (low+high)/2;

         if( target == nums[mid] ) {
            int ans = nums[mid];
            return new int[]{ans,ans};
         }else if( target > nums[mid]){
             low = mid+1;
             floor = nums[mid];
         } else {
            high = mid-1;
            ceil = nums[mid];
         }
       }
       return new int[]{floor,ceil};
    }

    public static void main(String[] args) {
       int[] nums ={3, 4, 4, 7, 8, 10};
       int target= 1;

       int[] ans = findFloorCeil(nums, target);

       System.out.println(" Ceil ="+ ans[1]+" floor= "+ ans[0]);

      


    }
    
}
