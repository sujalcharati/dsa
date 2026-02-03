package stackANDqueue.fundamentalsQuestion;

import java.lang.reflect.Array;

public class stackUsingArrays {


    static int[] st = new int[100];
    static int top = -1;
    static int size = 0;
    static void push( int x){

        if( top == st.length -1){
            System.out.println(" no available space..");
            return;
        }
        top++;
        size++;
        st[top] = x;
    }


    static int top(){

        if( top == -1){
            System.out.println( " no element in stack");
            return 0;
        }

        int data = st[top];
        return data;

    }

    static void pop(){

        if( top == -1) {
            System.out.println(" no elements in stack...");
            return;
        }

        int data = st[top];
        top--;
        size--;
    }

    static int size(){

        return size;
    }


    public static void main(String[] args) {

        push(3);     // push functionality...
        push(4);
        push(5);

        int ans =top();    // top functionality...
        System.out.println(ans);


        pop();             // pop functionality...
        for( int i=0; i< 5; i++){
            System.out.print(st[i]+" ");
        }
        System.out.println();



        int size = size();   // size functionality...
        System.out.println(size);

        
    }
    
}
