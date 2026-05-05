/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/



// class Solution {
//     public List<List<Integer>> allRootToLeaf(TreeNode root) {
//         //your code goes here
//         List<List<Integer>> ans = new ArrayList<>();
//         List<Integer> path = new ArrayList<>();
//         if( root == null) return ans;

//         helper( root, path, ans);

//         return ans;

//     }

//     public void helper(TreeNode root, List<Integer> path, List<List<Integer>> ans){

        

//         if( root == null ) return;
//         path.add(root.data);

//         if( root.left == null && root.right == null){
//             ans.add( new ArrayList<>(path));
//         } 
//         else {

//         helper( root.left, path, ans);
//         helper( root.right, path, ans);
//         }


//         path.remove( path.size()-1);
//     }
// }