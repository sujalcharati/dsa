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
//          Tuple( TreeNode node, int vertical){
//             this.node = node;
//             this.vertical = vertical;
//         }
//     }

//     public List<Integer> topView(TreeNode root) {
//         //your code goes here

//         List<Integer> ans = new LinkedList<>();

//         TreeMap<Integer, Integer> maps = new TreeMap<>();

//         if( root == null) return ans;

//         Queue<Tuple> que = new LinkedList<>();

//         que.offer( new Tuple(root, 0));

//         while( !que.isEmpty()){

//             Tuple t = que.poll();
//             TreeNode node = t.node;
//             int vert = t.vertical;


//             if( !maps.containsKey(vert)){
//                 maps.put(vert, node.data);
//             }

//             if( node.left != null) que.offer( new Tuple( node.left, vert-1));
//             if( node.right != null) que.offer( new Tuple( node.right, vert+1));


//         }

//         for( int val : maps.values()){
//             ans.add(val);
//         }

//          return ans;
//     }   
// }
