

// class Solution {
//     public int countSubsequenceWithTargetSum(int[] nums, int k) {
//         //your code goes here
//         int data = recursiveCall(0,nums,k,0);
//         return data;

//     }

//     public int recursiveCall(int index, int[] nums, int k, int sum){

//         if( index == nums.length){
//             if( sum == k ){
//                 return 1;
//             } else {
//                 return 0;
//             }
//         }
        
//         sum = sum+nums[index];
//         int left = recursiveCall(index+1, nums, k, sum);

//         sum = sum-nums[index];
//         int right = recursiveCall(index+1, nums, k, sum);

//         return left+right;
//     }

// }
