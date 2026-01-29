// /*Definition of doubly linked list:
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode prev;

//     ListNode() {
//         val = 0;
//         next = null;
//         prev = null;
//     }

//     ListNode(int data1) {
//         val = data1;
//         next = null;
//         prev = null;
//     }

//     ListNode(int data1, ListNode next1, ListNode prev1) {
//         val = data1;
//         next = next1;
//         prev = prev1;
//     }
// }
//  */

// class Solution {
//     public ListNode removeDuplicates(ListNode head) {

//         ListNode temp = head;

//         while( temp != null && temp.next != null){

//             ListNode Nextnode = temp.next;
//             while( temp.val == Nextnode.val && Nextnode != null){

//                 ListNode delete = Nextnode;
//                 Nextnode = Nextnode.next;
//             }

//             temp.next = Nextnode;

//             if( Nextnode != null){

//             Nextnode.prev = temp;
//             }
//             temp = temp.next;
//         }

//         return head;

//     }
// }


// // package linkedlist.mediumProblemsOfDLL;

// // public class removeDuplicatesFromDLL {
    
// // }
