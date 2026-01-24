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
//     public ListNode deleteMiddle(ListNode head) {

//         if( head == null && head.next == null) return null;

//         ListNode temp = head;
//         int len = 1;
//         while( temp!= null && temp.next != null){
//              len++;

//             temp = temp.next;
//         }


//         if( len ==1){
//             return null;
//         }

//         int size = len/2;
//         int counter = 0;
//         temp = head;

//         while( temp!= null ){

//             if( counter == size-1 && temp.next != null){
//                 ListNode del = temp.next;
//                 temp.next = temp.next.next;
//                 break;
//             }
//             temp = temp.next;

//             counter++;
//         }



//         System.out.print(head);
//         return head;
        
//     }
// }


// // public class deleteMiddleNode {
    
// // }
