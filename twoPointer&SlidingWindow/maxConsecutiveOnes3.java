// brute force solution ....



// class Solution {
//     public int longestOnes(int[] nums, int k) {
        
//         int n = nums.length;
//         int maxcount = 0;
//         for( int i=0; i <n; i++){
         
//          int count =0;
//          int zero_count =0;
//             for( int j=i; j< n; j++){

//                 if( nums[j] == 1){
                    
//                     count++;
//                 } else if( nums[j] == 0) {
                   
//                    if( zero_count < k){
//                     count++;
//                     zero_count++;
//                    } else{
//                     break;
//                    }
//                 }
//                 maxcount = Math.max( maxcount, count);
//             }
//         }
//         return maxcount;
//     }
// }



// optimal solution ...


// class Solution {
//     public int longestOnes(int[] nums, int k) {
        
//         int left = 0;
//         int right =0;
//         int n = nums.length;
//         int max_count = 0;
//         int zero_count = 0;
//         while( right < n){
          
//           if( nums[right] == 0){
//               zero_count++;
//           }
//             while( zero_count > k){
//                 if( nums[left] == 0){
//                     zero_count--;
//                 }
//                 left++;
//             }
//             max_count = Math.max( max_count, right-left+1);
//             right++;
//         }
//         return max_count;

//     }
// }