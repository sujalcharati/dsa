// brute force solutions ....


// class Solution {
//     public long subArrayRanges(int[] nums) {

//         long range = 0;
//         for( int i=0; i < nums.length; i++){
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;

//             for( int j=i; j < nums.length; j++){

//                  max = Math.max( max, nums[j]);
//                  min = Math.min( min, nums[j]);
//                  range += (max- min); 
//             }
//         }
//         return range;
        
//     }
// }


// optimal solution....


// class Solution {


//     public int[] findNSE(int[] nums){
//         int n = nums.length;
//         int[] ans = new int[n];

//         Stack<Integer> st = new Stack<>();

//         for( int i=n-1; i>=0; i--){
           
//            while( !st.isEmpty() && nums[st.peek()] >= nums[i]){
//                      st.pop();
//            }

//            ans[i] = !st.isEmpty()? st.peek() :n;

//            st.push(i);

//         }
//         return ans;
//     }
    

//     public int[] findPSE(int[] nums){
//         int n = nums.length;
//         int[] ans = new int[n];
//         Stack<Integer> st = new Stack<>();

//         for( int i=0; i< n; i++){

//             while( !st.isEmpty() && nums[i] < nums[st.peek()]){
//                 st.pop();
//             }
//             ans[i] = !st.isEmpty()? st.peek():-1;
//             st.push(i);
            
//         }
//           return ans;
//     }

//     public int[] findNGE( int[] nums){
        
//         int n = nums.length;
//         int[] ans = new int[n];
//         Stack<Integer> st = new Stack<>();

//         for( int i=n-1; i >=0; i--){
            
//             while( !st.isEmpty() && nums[i] >= nums[st.peek()]){
//                 st.pop();
//             }
//             ans[i]= !st.isEmpty() ? st.peek() :n;
//             st.push(i);
//         }
//         return ans;
//     }


//     public int[] findPGE( int[] nums){

//         Stack<Integer> st = new Stack<>();
//         int n = nums.length;
//         int[] ans = new int[n];

//         for( int i=0; i< n; i++){

//             while( !st.isEmpty() && nums[i] > nums[st.peek()]){
//                 st.pop();
//             }

//             ans[i] = !st.isEmpty() ? st.peek(): -1;
//             st.push(i);
//         }
//         return ans;
//     }

//     public long summationMax(int[] nums, int[] nge, int[] pge){
        
//         int n = nums.length;
//         long total = 0;
//         for( int i=0; i <n; i++ ){

//            int  right = nge[i]-i;
//            int left =  i-pge[i];

//             long freq = 1L*right*left;
//             total = total+(freq*nums[i]);

//         }
//         return total;
//     }

//     public long summationMin( int[] nums, int[] nse, int[] pse){

//         int n = nums.length;
//         long total =0;
//         for( int i=0; i< nums.length; i++){

//             int left = i-pse[i];
//             int right = nse[i]-i;

//             long freq = 1L*left*right;
//             total = total+(freq*nums[i]);
//         }

//         return total;
//     }



//     public long subArrayRanges(int[] nums) {

//         int[] nse = findNSE(nums);
//         int[] pse = findPSE(nums);
//         int[] nge = findNGE(nums);
//         int[] pge = findPGE(nums);


//         long max = summationMax(nums, nge, pge);
//         long min = summationMin(nums, nse, pse);

//         long ans = max-min;
//         return ans;



        


        
//     }
// }
