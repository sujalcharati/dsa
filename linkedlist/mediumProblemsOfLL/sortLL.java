// // package linkedlist.mediumProblemsOfLL;

// // public class sortLL {
    
// // }







// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {

//     public ListNode merge( ListNode left, ListNode right){


//         ListNode dummy = new ListNode(-1);

//         ListNode temp = dummy;

//         while( left != null && right != null){

//             if( left.val <= right.val){
//                 temp.next = left;
//                 left = left.next;
//             }else{
//                 temp.next = right;
//                 right =right.next;

//             }
//             temp = temp.next;


//         }

//         if( left != null) temp.next = left;
//         if( right != null) temp.next = right;
//         return dummy.next;

        
//     }

//     public ListNode findMiddleNode( ListNode head){

//         ListNode fast = head;
//         ListNode slow = head;

//         while(fast.next != null  && fast.next.next != null){
//             fast = fast.next.next;
//             slow = slow.next;
//         }
//         System.out.print(slow.val);
//         return slow;
//     }
//     public ListNode sortList(ListNode head) {


//         if( head == null || head.next == null ) return head;


//         ListNode middle = findMiddleNode(head);

//         ListNode left = head;
//         ListNode right = middle.next;
//         middle.next = null;

//         left = sortList(left);
//         right = sortList(right);

//         return merge( left, right);

//     }
// }