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

//     public ListNode reverse( ListNode head){
          
//           if( head == null || head.next == null) return head;

//           ListNode newHead = reverse( head.next);
//           ListNode front = head.next;
//           front.next = head;
//           head.next = null;
//           return newHead;
//     }
//     public boolean isPalindrome(ListNode head) {



//        ListNode fast = head;
//        ListNode slow = head;

//        while( fast.next != null && fast.next.next != null){

//         fast = fast.next.next;
//         slow = slow.next;
//        }

//        ListNode Newhead = reverse( slow.next);
//        ListNode first = head;
//        ListNode second = Newhead;

//        while( second != null){

//         if( first.val != second.val){
//             reverse(second);
//             return false;
//         }
//         first = first.next;
//         second= second.next;
//        }

//        reverse(second);
//        return true;
        
//     }
// }

// // public class isPalindrome {
    
// // }
