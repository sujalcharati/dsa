package linkedlist.learndoublyLL;

import java.security.Principal;

public class intoduction {

    int val;
    intoduction next;
    intoduction prev;

    intoduction(int val,intoduction next, intoduction prev){
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

    intoduction( int val){
        this.val = val;
    }

    static intoduction convertArraytoLL(int[] arr){

        intoduction head = new intoduction(arr[0]);
        intoduction prev = head;

        for( int i=1; i < arr.length;i++){

            intoduction temp = new intoduction(arr[i],null, prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }
    static void printll( intoduction head){

        intoduction temp = head;
        while ( temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
            
        }
        System.out.println();
    }

    static intoduction deletefirstnode(intoduction head){

        intoduction first_node = head;
        head = head.next;
        head.prev = null;

        return head;

    }

    static intoduction deletelastnode( intoduction head){
       
        intoduction temp = head;
        while( temp.next != null && temp.next.next != null){
            temp = temp.next;
        }
        intoduction last_node = temp.next;
        last_node.prev = null;
        temp.next = null;
        return head;
    }

    static intoduction delete_at_index_k( int index, intoduction head){
         
        intoduction temp = head;
        for( int i=0; i< index-1 ; i++){
            temp = temp.next;
        }
        intoduction delete_node = temp.next;
        temp.next = temp.next.next;
        if( temp.next != null){
            temp.next.prev = temp;
        }
        return head;

    }

    static intoduction delete_node_3(intoduction head){

        intoduction temp = head;

        while ( temp!= null) {

            if( temp.next.val == 3){
                intoduction delete_node = temp;
                temp.next = temp.next.next;
                temp.next.prev = temp;
                break;
            }
            
        }
        return head;
    }

    static intoduction insert_at_first_node(intoduction head){

        intoduction temp = new intoduction(9);
        temp.next = head;
        head.prev = temp;
        head = temp;

        return head;
        
    }

    static intoduction insert_at_last_node(intoduction head){

        intoduction node = new intoduction(9);

        intoduction temp = head;

        while( temp!= null && temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;

        return head;
    }


    static intoduction insert_at_k_index(intoduction head){
        int index =4;
         intoduction temp = head;
         intoduction node = new intoduction(9);
        for( int i=1; i< index; i++){

              temp = temp.next;
        }
        intoduction next_node = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next = next_node;
        if( next_node != null){
            next_node.prev = node;
        }
        return head;
    }

    public static void main(String[] args) {
        

        int[] arr = {1,3,4,5,6};



        intoduction data = convertArraytoLL(arr);

        printll(data);

        // intoduction data1 = deletefirstnode(data);
        // printll(data1);

        // intoduction data2 = deletelastnode(data);
        // printll(data2);

        // int index = 3;
        // intoduction data3 = delete_at_index_k(index, data);
        // printll(data3);


        // intoduction data4 = delete_node_3(data);
        // printll(data4);

        // intoduction data1 = insert_at_first_node(data );
        // printll(data1);
        
        // intoduction data2 = insert_at_last_node(data );
        // printll(data2);

        // intoduction data3 = insert_at_k_index(data);
        // printll(data3);


    }
    
}
