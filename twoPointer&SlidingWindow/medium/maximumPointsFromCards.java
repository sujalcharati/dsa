package medium;
// brute force...


// class Solution {
//     public int maxScore(int[] cardPoints, int k) {
        
//         int n = cardPoints.length;
//         int maxsum =0;
//         for( int i=0; i <=k; i++){
           
//            int sum = 0;
//             for( int j=0; j <i; j++){
//                 sum+=cardPoints[j];

//             }

//             for( int j=0; j< k-i; j++){
//                 sum+=cardPoints[n-1-j];
//             }

//             maxsum = Math.max( sum, maxsum);
//         }

//         return maxsum;
        
//     }
// }



// optimal solution ...



// class Solution {
//     public int maxScore(int[] cardPoints, int k) {

//         int leftsum = 0;
//         int rightsum = 0;
//         int maxsum = 0;
//         int n = cardPoints.length;

//         for( int i =0; i <= k-1; i++){
//             leftsum+=cardPoints[i];            

//         }
//         maxsum = leftsum;

//         for( int i=0; i < k; i++){

//             leftsum-=cardPoints[k-i-1];
//             rightsum+=cardPoints[n-1-i];

//             maxsum = Math.max(maxsum, leftsum+rightsum);
//         }
//         return maxsum;
//     }
// }