// brute force solution....


// class Solution {
//     public int numberOfSubarrays(int[] nums, int k) {


//         int count = 0;
//         int n = nums.length;
//         for( int i=0; i< n; i++){
//             int odd =0;
//             for( int j=i; j<n; j++){

//                 if( nums[j] %2 != 0){
//                     odd++;
//                 }

//                 if( odd ==k){
//                     count++;
//                 }
//             }
//         }
//         return count;
        
//     }
// }



// optimal solution ....




// class Solution {

//     public int atmost( int[] nums, int k){

//         if( k <0) return 0;
//         int l = 0;
//         int sum = 0;
//         int count = 0;

//         for( int r=0; r< nums.length; r++){
//             sum+=(nums[r]%2);

//             while( sum > k){
//                sum-=(nums[l]%2);
//                 l++;
                
//             }

//           count = count+(r-l+1);
            
//         }
//         return count;
//     }
//     public int numberOfSubarrays(int[] nums, int k) {
//         return atmost( nums, k) - atmost( nums, k-1);
        
//     }
// }