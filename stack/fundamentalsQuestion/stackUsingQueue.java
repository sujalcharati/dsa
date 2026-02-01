package stack.fundamentalsQuestion;
import java.util.*;
public class stackUsingQueue {

     static Deque<Integer> que = new ArrayDeque<>();
     static int size = 0;


    static void push(int val){
     
        int siz = que.size();
        
        que.add(val);

        for( int i=1; i<= siz; i++){

            que.add(que.peek());
            que.pop();
        }
        size++;

    }


    static void pop(){

        que.pop();
        size--;
    }

    static int top(){
        int ans = que.peek();
        return ans;
    }

    static int size(){
        int ans = que.size();
        return ans;
    }

    public static void main(String[] args) {

        push(3);
        push(4);
        push(5);


        pop();
        int top =top();
        System.out.println(top);
        int sizes = size();
        System.out.println(sizes);









        

    }
    
}
