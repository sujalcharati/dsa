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
//     public List<Integer> postorderTraversal(TreeNode root) {

//         List<Integer> ans = new ArrayList<>();

//         if( root == null ) return ans;
//         Stack<TreeNode> st1 = new Stack<>();
//         Stack<TreeNode> st2 = new Stack<>();

//         st1.push(root);

//         while( !st1.isEmpty()){
//              TreeNode topval = st1.pop();
//              st2.push( topval);

//              if( topval.left != null) st1.push(topval.left);
//              if( topval.right != null ) st1.push(topval.right);
//         }

//         while( !st2.isEmpty()){

//             ans.add(st2.pop().val);
//         }

//         return ans;
        
//     }
// }
