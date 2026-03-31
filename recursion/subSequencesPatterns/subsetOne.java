// class Solution {
//     public List<Integer> subsetSums(int[] nums) {
//         //your code goes here

//         List<Integer> ans = new ArrayList<>();

//         sumofSubsets(0, ans, 0, nums);
//         Collections.sort(ans);
//         return ans;
//     }

//     public void sumofSubsets(int index, List<Integer> ans, int sum, int[] nums){

//         if( index == nums.length){
//             ans.add(sum);
//             return;
//         }
//         sum+=nums[index];
//         sumofSubsets(index+1, ans, sum, nums);
//         sum-=nums[index];
//         sumofSubsets(index+1, ans, sum , nums);
//     }
// }