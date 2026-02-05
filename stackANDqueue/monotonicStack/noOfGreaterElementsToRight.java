// brute force solution .....


// class Solution {
//     public List<Integer> count_NGE(int[] arr, int[] indices) {
//         // Your code goes here

//         ArrayList<Integer> ans = new ArrayList<>();
//         for( int i=0; i < indices.length; i++){
//             int elem = arr[indices[i]];
//             int count =0;
            

//             for( int j=0; j < arr.length; j++){
//                 if( elem == arr[j] && j==indices[i]){

//                     for( int k=j+1; k < arr.length; k++){
//                         if( arr[k] > elem){
//                             count++;
//                         }
//                     }
//                   ans.add(count);
//                 }
//             }
//         }
//         return ans;
//     }
// }



// with stack solution ....

