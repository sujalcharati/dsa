package linkedlist.learnlinkedlist;

public class insertion {

    // Node class
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    Node head;
    
    // Insert at head (beginning)
    public void insertAtHead(int value) {
        Node newNode = new Node(value);
        newNode.next = head;  // Point new node to current head
        head = newNode;       // Update head to new node
    }
    
    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insertion list = new insertion();
        
        // Insert elements at head
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        
        // Display: 30 -> 20 -> 10 -> null
        list.display();
    }
}
