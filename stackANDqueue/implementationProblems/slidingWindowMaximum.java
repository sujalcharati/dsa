// brute force solution ....



// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {

//         if(nums.length == 0) return new int[0];

//         int n = nums.length;

//         ArrayList<Integer> ans = new ArrayList<>();
//         for( int i=0; i< n-k+1; i++){
//             int max = nums[i];
//             for( int j=i; j <=i+k-1; j++){

//                 max = Math.max(max, nums[j]);
//             }
//             ans.add(max);
//         }

//         int[] val = new int[ans.size()];
//         for( int i=0; i< val.length; i++){
//             val[i] = ans.get(i);
//         }

//         return val;
//     }
// }






// optimal solution ....



// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {

//         int n = nums.length;
//         Deque<Integer> dq = new ArrayDeque<>();
//         ArrayList<Integer> list = new ArrayList<>();

//         for( int i=0; i < n; i++ ){

//             if( !dq.isEmpty() && dq.getFirst() <= i-k){
//                 dq.removeFirst();
//             }

//             while( !dq.isEmpty() && nums[i] > nums[dq.getLast()]){
//                 dq.removeLast();
//             }
//             dq.addLast(i);

//             if( i >= k-1) list.add( nums[dq.getFirst()]);

//         }

//         int[] ans = new int[n-k+1];

//         for( int i=0; i < ans.length; i++){
//             ans[i] = list.get(i);
//         }

//         return ans;
//     }
// }


