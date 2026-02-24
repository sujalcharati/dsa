// class Solution {


//     public int[] findNextSmaller( int[] nums){
//         int n = nums.length;
//         Stack<Integer> st = new Stack<>();
//         int[] ans = new int[n];

//        for( int i=n-1; i >=0; i--){

//         while( !st.isEmpty() && nums[i] <= nums[st.peek()]){
//             st.pop();
//         }
//         ans[i] = !st.isEmpty() ? st.peek() :n;
//         st.push(i);

//        }

//        return ans;
//     }

//     public int[] findPrevSmaller(int[] nums){

//         int n = nums.length;
//         int[] ans = new int[n];

//         Stack<Integer> st = new Stack<>();

//         for( int i=0; i < n; i++){

//             while( !st.isEmpty() && nums[i] < nums[st.peek()]){
//                 st.pop();
//             }

//             ans[i]= !st.isEmpty() ? st.peek(): -1;
//             st.push(i);
//         }
//         return ans;
//     }


//     public int largestRectangleArea(int[] heights) {

//         int[] nse = findNextSmaller(heights);
//         int[] pse = findPrevSmaller(heights);
        
//         int max =0;

//         for(int i=0; i < heights.length; i++){

//             int area = heights[i]*(nse[i]-pse[i]-1);
//             max = Math.max(area, max);

//         }
//         return max;
        
        
//     }
// }

// // public class largestRectangleInHIstogram {
    
// // }
