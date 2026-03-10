// brute force solution ....


// class Solution {
//     public int subarraysWithKDistinct(int[] nums, int k) {

//         int n = nums.length;
//         int count = 0;
//         for( int i=0; i <n; i++){
//                HashMap<Integer, Integer> mapp = new HashMap<>();
//             for( int j=i; j<n; j++){
//                mapp.put( nums[j], mapp.getOrDefault(nums[j],0)+1);

//                if( mapp.size() == k){
//                     count++;
//                }

//             }
//         }
//         return count;
//     }
// }



// optimal solution...