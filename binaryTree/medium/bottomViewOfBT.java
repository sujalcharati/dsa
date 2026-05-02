// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int data;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode(int val) { data = val; left = null, right = null }
//  * }
//  **/

// class Solution {

//     class Tuple {
//         TreeNode node;
//         int vertical;
//         Tuple( TreeNode node, int vertical){
//             this.node = node;
//             this.vertical = vertical;
//         }
//     }

//     public List<Integer> bottomView(TreeNode root) {
//         //your code goes here
//         List<Integer> ans = new ArrayList<>();
//         TreeMap<Integer, Integer> map = new TreeMap<>();

//         Queue<Tuple> que = new LinkedList<>();
        
//         que.offer( new Tuple(root, 0));

//         while( !que.isEmpty()){

//             Tuple t = que.poll();
//             TreeNode node = t.node;
//             int vert = t.vertical;

//             map.put( vert, node.data);

//             if( node.left != null) que.offer( new Tuple(node.left, vert-1));
//             if( node.right != null) que.offer( new Tuple(node.right, vert+1));
//         }

//         for( int val: map.values()){
//             ans.add(val);
//         }

//         return ans;



//     }
// }
