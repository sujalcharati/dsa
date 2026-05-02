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
//     public List<Integer> boundary(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();

//         if (root == null) return ans;

//         ans.add(root.data);

//         if (root.left == null && root.right == null) return ans;

//         leftTraversal(root, ans);
//         addInorder(root, ans);
//         rightBoundary(root, ans);
//         return ans;
//     }


//     public void leftTraversal(TreeNode root, List<Integer> ans) {

//         TreeNode curr = root.left;

//         while (curr != null) {

//             if (curr.left != null || curr.right != null) ans.add(curr.data);
//             if (curr.left != null) curr = curr.left;
//             else curr = curr.right;
//         }

//     }

//     public void addInorder(TreeNode root, List<Integer> ans) {

//         if (root == null) return;

//         if (root.left == null && root.right == null) {
//             ans.add(root.data);
//             return;
//         }

//         addInorder(root.left, ans);
//         addInorder(root.right, ans);
//     }

//     public void rightBoundary(TreeNode root, List<Integer> ans) {

//         TreeNode curr = root.right;
//         List<Integer> temp = new ArrayList<>();

//         while (curr != null) {

//             if (curr.left != null || curr.right != null) {
//                 temp.add(curr.data);
//             }

//             if (curr.right != null) curr = curr.right;
//             else curr = curr.left;
//         }

//         for (int i = temp.size() - 1; i >= 0; i--) {
//             ans.add(temp.get(i));
//         }

//     }
// }
