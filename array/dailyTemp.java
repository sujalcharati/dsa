// brute force solution...


// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {

       

//        int n = temperatures.length;
//        int[] ans = new int[n];

//         for( int i=0; i< temperatures.length; i++){

//           for( int j=i+1; j< temperatures.length; j++){


//             if( temperatures[j] > temperatures[i]){

//                 ans[i] = j-i;
//                 break;
//             }


//           }


//         }
        
//         return ans;
        
//     }
// }




// optimal solution....


