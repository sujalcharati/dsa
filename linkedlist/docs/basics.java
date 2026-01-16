package linkedlist.docs;

public class basics {

    public Node head;
    public Node tail;

    int size =0;

    public  basics(){
        this.size = 0;
    }


    public void insertAtBeginning( int val){
          
        Node node = new Node(val);
        node.next = head;
        head = node;

        if( tail == null){
            tail = head;
        }
        size +=1;
    }


    public void insertAtEnd( int val){


                                 // with time complexity of big 0 n: 
        
        // Node temp = head;
        // Node newnode = new Node(val);

        // while( temp.next != null){

        //     temp = temp.next;
        // }
        
        // temp.next = newnode;
        // temp = newnode;


                                          // with tail node help 

        if( tail == null){
            insertAtBeginning(val);
            return;
        }

        Node newnode = new Node(val);
        tail.next = newnode;
        tail = newnode;
    }


    public void insertAtIndex( int val, int index){

        if( index ==0) {
            insertAtBeginning(val);
            return;
        }
        if( index == size){
            insertAtEnd(val);
            return;
        }

        Node temp = head;

        for( int i=1; i < index; i++){
            temp = temp.next;
        }

        Node newnode = new Node( val, temp.next);
        temp.next = newnode;
        size++;
    }


    public void displayLinkedlist( ){

            Node temp = head;
            temp = head;

            while( temp != null){
                System.out.print( temp.value + "--->");
                temp = temp.next;
            }
    }



    public void deleteAtFirst(){
        
        // int val = head.value;
        head = head.next;

        if( head == null){
            tail = null;
        }
        size--;
    }


    public void deleteAtEnd(){

        int val = tail.value;
        Node temp = head;
        while ( temp.next.next != null) {
             temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }


    public void deleteAtIndex(int index){

        if( index == 0){
            deleteAtFirst();
            return;
        }
        if( index == size - 1){
            deleteAtEnd();
            return;
        }

        Node temp = head;

        for( int i = 1; i < index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }


    public class Node {

        int value;
        Node next;
    

        public Node( int value, Node next){
            this.next = next;
            this.value = value;
        }

        public Node( int value){
            this.value = value;
        }


        
    }
    public static void main(String[] args) {

        
        basics list = new basics();
                                           // addition of linkedlist....
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(3);

        // list.displayLinkedlist();    // 3--->2--->1--->
        list.insertAtEnd(4);
        // list.displayLinkedlist();       // 3--->2--->1--->4--->
        list.insertAtIndex(23, 2);
        // list.displayLinkedlist();          // 3--->2--->23--->1--->4--->

  
                                           // deletion of the linkedlist
        list.deleteAtFirst();
        // list.displayLinkedlist();          // 2--->23--->1--->4--->
        list.deleteAtEnd();
        // list.displayLinkedlist();             // 2--->23--->1--->
        list.deleteAtIndex(1);;
        list.displayLinkedlist();

        
    }
    
}
