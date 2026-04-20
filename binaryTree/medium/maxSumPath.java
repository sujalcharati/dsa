/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// class Solution {
//     public int maxPathSum(TreeNode root) {
     
//      int maxSum[] = new int[1];
//      maxSum[0] = Integer.MIN_VALUE;
//      maxsum(root, maxSum);
//      return maxSum[0];

        
//     }

//     public int maxsum( TreeNode root, int[] maxSum){

//         if( root == null ) return 0;

//         int left = Math.max(0, maxsum( root.left , maxSum));
//         int right = Math.max(0, maxsum(root.right, maxSum));

//         maxSum[0] = Math.max( maxSum[0], left+right+root.val);
//         return root.val + Math.max( left, right);

//     }
// }
