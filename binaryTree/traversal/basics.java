// pre-order traversal..


// package binaryTree.traversal;

// public class basics {

//     static class treenode {
//         int val;
//         treenode left, right;

//         treenode( int val){
//             this.val = val;
//         }


//     }

//     public static void main(String[] args) {


//         treenode root = new treenode(1);
//         root.left = new treenode(2);
//         root.right = new treenode(3);
//         root.left.left = new treenode(4);
//         root.left.right = new treenode(5);
//         root.right.right = new treenode(6);


//         preOrder(root);
        

        
//     }

//     public static void preOrder( treenode root){
        
//         if( root == null) return;

//         System.out.println( root.val);
//         preOrder(root.left);
//         preOrder(root.right);
        
//     }
    
// }



// In- order traversal ...


// package binaryTree.traversal;

// public class basics {

//     static class treenode {
//         int val;
//         treenode left, right;

//         treenode( int val){
//             this.val = val;
//         }


//     }

//     public static void main(String[] args) {


//         treenode root = new treenode(1);
//         root.left = new treenode(2);
//         root.right = new treenode(3);
//         root.left.left = new treenode(4);
//         root.left.right = new treenode(5);
//         root.right.right = new treenode(6);


//         inOrder(root);
        

        
//     }

//     public static void inOrder( treenode root){
        
//         if( root == null) return;

//         inOrder(root.left);
//         System.out.println( root.val);
//         inOrder(root.right);
        
//     }
    
// }


// post-Order traversal ...



// package binaryTree.traversal;

// public class basics {

//     static class treenode {
//         int val;
//         treenode left, right;

//         treenode( int val){
//             this.val = val;
//         }


//     }

//     public static void main(String[] args) {


//         treenode root = new treenode(1);
//         root.left = new treenode(2);
//         root.right = new treenode(3);
//         root.left.left = new treenode(4);
//         root.left.right = new treenode(5);
//         root.right.right = new treenode(6);


//         postOrder(root);
        

        
//     }

//     public static void postOrder( treenode root){
        
//         if( root == null) return;

//         postOrder(root.left);
//         postOrder(root.right);
//         System.out.println( root.val);
        
//     }
    
// }



// level order traversal..

package binaryTree.traversal;

import java.util.LinkedList;
import java.util.Queue;

import linkedlist.linkedlist;

public class basics {

    static class treenode {
        int val;
        treenode left, right;

        treenode( int val){
            this.val = val;
        }


    }

    public static void main(String[] args) {


        treenode root = new treenode(1);
        root.left = new treenode(2);
        root.right = new treenode(3);
        root.left.left = new treenode(4);
        root.left.right = new treenode(5);
        root.right.right = new treenode(6);


        levelOrder(root);
        

        
    }

    public static void levelOrder( treenode root){

        Queue<treenode> queue = new LinkedList<>();
        queue.offer(root);

        while ( !queue.isEmpty()) {

            int size = queue.size();

            for( int i=0; i < size; i++){

                treenode curr = queue.poll();

                System.out.println(curr.val + " ");

                if( curr.left != null ) queue.offer(curr.left);
                if( curr.right != null) queue.offer(curr.right);
            }

            System.out.println();
            
        }


    }
    
}
