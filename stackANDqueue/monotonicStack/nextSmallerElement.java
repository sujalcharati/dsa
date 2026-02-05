// // public class nextSmallerElement {
    
// // }


// class Solution {
//     public int[] nextSmallerElements(int[] arr) {
//         // Your code goes here
//         int n = arr.length;
//         Stack<Integer> st = new Stack<>();
//         int[] ans = new int[n];

//         for( int i=n-1; i>=0; i--){
//             int curr = arr[i];

//             while( !st.isEmpty() && curr < st.peek() ){
//                 st.pop();
//             }

//             if( st.isEmpty()){
//                 ans[i] = -1;

//             }else {
//                 ans[i] = st.peek();
//             }

//             st.push(curr);
//         }

//         return ans;
//     }
// }