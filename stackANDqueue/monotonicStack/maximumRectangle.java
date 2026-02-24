// class Solution {


//    public int[] findpsee( int[] nums){

//     Stack<Integer> st = new Stack<>();
//     int[] ans = new int[nums.length];

//    for( int i=0; i < nums.length; i++){

//     while( !st.isEmpty() && nums[i] < nums[st.peek()]){
//         st.pop();
//     }
//     ans[i] = !st.isEmpty() ? st.peek() : -1;
//     st.push(i);
//    }

//    return ans;
//    }

//    public int[] findnsee( int[] nums){

//     Stack<Integer> st = new Stack<>();
//     int n = nums.length;
//     int[] ans = new int[n];

//     for( int i=n-1; i>=0; i--){

//         while( !st.isEmpty() && nums[i] <= nums[st.peek()]){
//             st.pop();
//         }

//         ans[i] = !st.isEmpty() ? st.peek(): n;
//         st.push(i);
//     }
//     return ans;
//    }



//     public int histogramArea(int[] arr){

//         int[] pse = findpsee(arr);
//         int[] nse = findnsee(arr);
//         int max = 0;

//         for( int i=0; i< arr.length; i++){

//            int  area = arr[i]*(nse[i]-pse[i]-1);
//            max = Math.max(max, area);
//         }
//         return max;
//     }


//     public int maximalRectangle(char[][] matrix) {

//         int n = matrix.length;
//         if( n == 0) return 0;

//         int rows = n;
//         int cols = matrix[0].length;
//         int[] heights = new int[cols];
//         int maxArea = 0;

//         for( int i=0; i < rows; i++){

//             for( int j=0; j < matrix[i].length; j++){

//                 if( matrix[i][j] == '1'){
//                     heights[j]+=1;
//                 } else{
//                     heights[j]=0;
//                 }
//             }

//         maxArea = Math.max( maxArea, histogramArea(heights));
//         }
//         return maxArea;
        
//     }
// }


// // public class maximumRectangle {
    
// // }
