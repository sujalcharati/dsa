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


//     class Tuple {
//         TreeNode node;
//         int col;
//         int row;
//         Tuple( TreeNode node, int col, int row){
//             this.node = node;
//             this.col= col;
//             this.row = row;
//         }
//     }

//     public List<List<Integer>> verticalTraversal(TreeNode root) {

//         TreeMap< Integer, TreeMap<Integer, PriorityQueue<Integer>>> maps = new TreeMap<>();

//         Queue< Tuple> que = new LinkedList<>();

//         que.offer( new Tuple( root,0,0 ));

//         while( !que.isEmpty()){

//             Tuple t = que.poll();
//             TreeNode node = t.node;
//             int row = t.row;
//             int col = t.col;

//             maps.putIfAbsent(col, new TreeMap<>());
//             maps.get(col).putIfAbsent(row, new PriorityQueue<>());
//             maps.get(col).get(row).offer(node.val);

//             if( node.left != null){
//                 que.offer( new Tuple(node.left,col-1 , row+1));
//             }

//             if( node.right != null){
//                 que.offer( new Tuple(node.right, col+1, row+1));
//             }

//         }
        
//         List<List<Integer>> ans = new ArrayList<>();
//         for( TreeMap<Integer, PriorityQueue<Integer>> rows : maps.values()){

//             List<Integer> res = new ArrayList<>();

//             for(PriorityQueue<Integer> p : rows.values()){

//                 while( !p.isEmpty()){
//                     res.add(p.poll());
//                 }
//             }
//              ans.add(res);

//         }

//         return ans;
        
//     }
// }
