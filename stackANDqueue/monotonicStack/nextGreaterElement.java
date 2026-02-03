// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
//         Stack<Integer> st = new Stack<>();
//         HashMap<Integer, Integer> mapp = new HashMap<>();

//         for(int num : nums2){

//             while( !st.isEmpty() && num > st.peek()){
//                 mapp.put(st.pop(), num);
                
//             }
//             st.push(num);

//         }

//         while( !st.isEmpty()){
//             mapp.put(st.pop(), -1);
//         }

//         int[] ans = new int[nums1.length];
//         for( int i=0; i < nums1.length; i++){
//             ans[i] = mapp.get(nums1[i]);
//         }

//         return ans;
        
//     }
// }




// package stackANDqueue.monotonicStack;

// public class nextGreaterElement {


//     public static void main(String[] args) {
        
//     }
    
// }
