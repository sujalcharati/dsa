
// class Solution {
//     public boolean checkSubsequenceSum(int[] nums, int k) {
//          //your code goes here
//          boolean data = recursiveCall(0,0,nums,k);
//          return data;
//     }

//     public boolean recursiveCall( int index, int sum, int[] nums, int k){

//         if( index == nums.length){
//             if( sum == k){
//                 return true;
//             } else {
//                 return false;
//             }
//         }
        
//         sum = sum+nums[index];
//         if( recursiveCall(index+1, sum, nums, k) == true){
//               return true;
//         }

//         sum-=nums[index];

//         return recursiveCall(index+1, sum, nums, k);


//     }
// }