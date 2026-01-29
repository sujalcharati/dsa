/*
class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
*/

// class Solution {
//     public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
//         // Your code goes here
//         List<List<Integer>> result =new ArrayList<>();
//         ListNode left = head;
//         ListNode right = head;

//         while( right.next != null){
//             right = right.next;
//         }

//         while( left!= null && right != null && right != left && right.next != left){

//             List<Integer> pair = new ArrayList<>();

//             int sum = left.val + right.val;

//             if( sum == target){

//                 pair.add(left.val);
//                 pair.add(right.val);

//                 result.add(pair);

//                 left = left.next;
//                 right = right.prev;
//             } else if( sum > target){
//                 right = right.prev;
//             } else{
//                 left = left.next;
//             }
//         }

//         return result;
//     }
// }


// package linkedlist.mediumProblemsOfDLL;

// public class findPairs {
    
// }
