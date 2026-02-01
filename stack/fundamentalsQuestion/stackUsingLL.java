package stack.fundamentalsQuestion;

public class stackUsingLL {


    static class Node{

        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }

        Node( int val, Node next){
            this.next = next;
            this.val = val;
        }
    }

    static int size =0;

    static Node top = null;

    static void push(int x){
        
      
        Node temp = new Node(x);

        temp.next = top;
        top = temp;
        size++;
    }


    static void pop(){

        Node temp = top;

        top = top.next;
        size--;
    }

    static int top(){

        Node temp = top;
        return temp.val;
    }


    static int size(){
        return size;
    }



    

    public static void main(String[] args) {
        
        push(3);
        push(4);
        push(5);
        push(6);


        pop();


        int data = top();
        System.out.println(data);
        size();
        int final_size = size();
        System.out.println(final_size);
    }
    
}
