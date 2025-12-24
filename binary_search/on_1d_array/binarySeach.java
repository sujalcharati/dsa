// brute force 

// package binary_search;

// public class binarySeach {

//     public static Integer searchElement(int[] nums,int target){
            
//         int low = 0;
//         int high = nums.length-1;
        
        
//         while( low <= high){
//             int mid= (low+ high)/ 2;

//             if( target == nums[mid]) return mid;
//             else if( target > nums[mid]){

//                 low= mid+1;
//             }else high= mid-1;


            
//         }
//         return -1;
//     }
//     public static void main(String[] args) {

//         int[] nums = {-1,0,3,5,9,12};
//         int  target = -1; 
//         int val = searchElement(nums,target);       
//         System.out.print(val);
//     }
    
// }



// optimal searching 

package binary_search.on_1d_array;

public class binarySeach {

    public static Integer searchElement(int[] nums,int target,int low, int high){

        if( low > high){
             return -1;
        }
        
            int mid= low+ (high-low)/ 2;

            if( target == nums[mid]) return mid;
            else if( target > nums[mid]){

                return searchElement(nums, target, mid+1, high);
            }else return searchElement(nums, target, low, mid-1);


            
        
    }

    public static void main(String[] args) {

        int[] nums = {-1,0,3,5,9,12};
        int  target = 0; 
        int low = 0;
        int high = nums.length-1;
        int val = searchElement(nums,target,low,high);       
        System.out.print(val);
    }
    
}
