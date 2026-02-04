// public class nextGreaterElementTwo {
    
// }



// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
      
//       int n = nums.length;
//       int[] ans = new int[n];
//       Arrays.fill( ans, -1);
//       Deque<Integer> st = new ArrayDeque<>();

//       for( int i=2*n-1; i>=0; i++){
//         int ind = i%n;
//         while( !st.isEmpty() && nums[ind] >= nums[st.peek()]){
//             st.pop();
//         }
           

//            if( i < n){
             
//              if( st.isEmpty()){
//                 ans[ind]=-1;
//              }else{
//                 ans[ind]= st.peek();
//              }
//            }

//            st.push(ind);
//       }

//       return ans;
        
        
//     }
// }
