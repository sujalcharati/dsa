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


// class Solution {

//     public int atmost(int[] nums, int k){

//              int l =0;
//         HashMap<Integer, Integer> mapp = new HashMap<>();
//         int count = 0;

//         for( int r=0; r < nums.length; r++){
            
//             mapp.put( nums[r], mapp.getOrDefault(nums[r],0)+1);

//             while( mapp.size() > k){

//                 mapp.put( nums[l], mapp.get(nums[l])-1);

//                 if( mapp.get(nums[l]) == 0){
//                     mapp.remove(nums[l]);
//                 }
//                 l++;
//             }

//             count += r-l+1;
 
//         }
//         return count;

//     }
//     public int subarraysWithKDistinct(int[] nums, int k) {
        
//          return atmost(nums, k)- atmost(nums, k-1);
//     }
// }