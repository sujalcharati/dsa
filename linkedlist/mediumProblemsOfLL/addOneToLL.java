// /*Definition of singly linked list:
// class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {
//         val = 0;
//         next = null;
//     }

//     ListNode(int data1) {
//         val = data1;
//         next = null;
//     }

//     ListNode(int data1, ListNode next1) {
//         val = data1;
//         next = next1;
//     }
// }
//  */

// class Solution {

//     public ListNode reverse( ListNode head){

//         ListNode curr = head;
//         ListNode Next = null;
//         ListNode prev = null;

//         while( curr != null){

//             Next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = Next;
//         }
//          return prev;
//     }

//     public ListNode addOne(ListNode head) {

//     head = reverse(head);
//     ListNode curr = head;
//     int carry =1;

//     while( curr != null && carry >0){

//         int val = curr.val + carry;
//         curr.val = val%10;
//         carry = val/10;
        
//         if( curr.next == null && carry >0){
//             curr.next = new ListNode(carry);
//             carry=0;
//         }
//         curr = curr.next;
//     }

//     return reverse(head);

//     }
// }




// // package linkedlist.mediumProblemsOfLL;

// // public class addOneToLL {
    
// // }

