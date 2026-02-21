// brute force solution ....


// class Solution {
//     public int sumSubarrayMins(int[] arr) {
//         int n = arr.length;
//         int mod = (int)1e9+7;
//         int total =0;
//         for( int i=0; i < n; i++){
//             int min = arr[i];
//             for( int j=i; j < n; j++){
                 
//                  min = Math.min( arr[j], min);
//                  total = (total+min) %mod;


//             }
//         }

//         return total;
        
//     }
// }



// optimal solution ...




// public class sumOfSubarraysMinimum {
    
// }
