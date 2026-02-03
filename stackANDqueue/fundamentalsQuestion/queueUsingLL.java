package stackANDqueue.fundamentalsQuestion;

public class queueUsingLL {


    static Node start = null;
    static Node end = null;
    static int size = 0;

    static class  Node { 
         
        int val;
        Node next;

        Node( int val){
            this.val = val;
            this.next = null;
        }

        Node( int val, Node next){

            this.val = val;
            this.next = next;
        }
        
    }


    static void push(int x){

        Node temp = new Node(x);

        if( start == null){

            start = end = temp;
        } else{

            end.next = temp;
            end = temp;
        }


        size++;


    }

    static void pop(){

        if( start == null) {
            System.out.println(" no space in queue...");
            return;
        }

        Node del = start;
        start = start.next;
        size--;

    }

    static int top(){

        int top_elem = start.val;
        return top_elem;
    }

    static int size(){
        return size;
    }

    static void printQueue(){
        Node temp = start;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        push(3);
        push(4);
        push(5);

        printQueue();

        pop();

        System.out.println(start.val);
        int val = top();
        System.out.println(val);
        int que_size = size();
        System.out.println(que_size);

    }
    
}
