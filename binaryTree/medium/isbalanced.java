// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public boolean isBalanced(TreeNode root) {

    
//      return checkBalance( root);
        
//     }

//     public boolean  checkBalance( TreeNode root){

//         if( root == null ) return true;

//         int left = checkdepth( root.left);
//         int right = checkdepth( root.right);

//         if( Math.abs( left-right) > 1){
//             return false;
//         }

//         return checkBalance( root.left) && checkBalance( root.right);

    
//     }

//     public int checkdepth( TreeNode root){

//         if ( root == null) return 0;
//         int left = checkdepth( root.left);
//         int right = checkdepth( root.right);

//         return 1+Math.max( left, right);


//     }
// }