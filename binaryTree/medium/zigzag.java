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
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {


//         List<List<Integer>> ans = new ArrayList<>();
//         Queue<TreeNode> q = new LinkedList<>();

//         q.offer(root);
//         boolean lefttoright = true;

//         while( !q.isEmpty()){

//             int size = q.size();
//             Integer[] arr = new Integer[size];

//             for( int i=0; i < size; i++){

//                 TreeNode node = q.poll();
                
//                 int index = lefttoright ? i : size-1-i;

//                 if( node == null ) return ans;

//                 arr[index] = node.val;


//                 if( node.left != null )  q.offer( node.left);
//                 if( node.right != null )  q.offer( node.right);

//             }
//               lefttoright = !lefttoright;
//               ans.add(Arrays.asList(arr));


//         }

//         return ans;
        
//     }
// }