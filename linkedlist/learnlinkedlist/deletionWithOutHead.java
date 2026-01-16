/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// class Solution {
//     public void deleteNode(ListNode node) {

//         node.val = node.next.val;
//         node.next = node.next.next;
        
//     }
// }


package linkedlist.learnlinkedlist;

public class deletionWithOutHead {

    Node head;
 

    static class  Node  {
        int value;
        Node next;
        
        Node( int value){
            this.value = value;
            this.next = null;
        }
    }


    public void insertAtBeginning(int value){

        Node newnode = new Node(value);

        newnode.next = head;
        head = newnode;

        
    }


    public void display(){

        Node temp = head;

        while( temp!= null){
            System.out.print(temp.value+ "--->");
            temp = temp.next;
        }
    }


    public void delete( Node node){
       
        node.value = node.next.value;
        node.next = node.next.next;
    }
    


    public static void main(String[] args) {
        deletionWithOutHead ll = new deletionWithOutHead();
        Node node = new Node(2);

        ll.insertAtBeginning(1);
        ll.insertAtBeginning(2);
        ll.insertAtBeginning(3);

        ll.display();
        ll.delete(node);
        ll.display();
    }
}