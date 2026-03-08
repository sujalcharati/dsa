
// brute force solution ...


// class Solution {
//     public int numSubarraysWithSum(int[] nums, int goal) {
        
//         int n = nums.length;
        
//         int count = 0; 
//         for( int i=0; i <n; i++){

//         int sum = 0;

//             for( int j=i; j<n; j++){
//                sum = sum+nums[j];

//                if( sum == goal){
//                    count++;
//                }
//             }
//         }

//         return count;
//     }
// }



// optimal solution ...


// class Solution {


//   public int atmost(int[] nums, int goal){
//     if( goal <0) return 0;
//         int n = nums.length;
//         int l = 0;
//         int sum =0;
//         int count =0;
//         for( int r=0; r<n; r++){

//             sum = sum+nums[r];
//             while( sum > goal){
//                 sum = sum-nums[l];
//                 l++;
//             }

//             count+= (r-l+1);
            
//         }
//         return count;
//   }
//     public int numSubarraysWithSum(int[] nums, int goal) {
        
        
//         return atmost(nums, goal)- atmost(nums, goal-1);
//     }
// }
