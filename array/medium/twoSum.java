// Input: nums = [1, 6, 2, 10, 3], target = 7

// Output: [0, 1]


// brute force method: 

// package array.medium;

// public class twoSum {

//     public static void main(String[] args) {

//         int[] nums = { 1, 3, 5, -7, 6, -3};
//         int target =7;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 int sum = nums[i]+nums[j];
//                 if( sum == target){
//                     System.out.println("[" + i + ", " + j + "]");
//                     break;
//                 }

//             }
//         }        
//     }
    
// }


// optimise method using hashing :
package array.medium;

import java.util.HashMap;

public class twoSum {

    public static void main(String[] args) {

        int[] nums = { 1, 3, 5, -7, 6, -3};
        int target =7;

        HashMap<Integer,Integer> mapp = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){

            int num = nums[i];
            int req_num = target-num;

            if(mapp.containsKey(req_num)){
                System.out.println("["+i+","+ mapp.get(req_num)+"]");
                return ;
            }

            mapp.put( nums[i],i);
        
        }        
        System.out.println(" no indices found in the array");
    }
    
}