package stackANDqueue.fundamentalsQuestion;
import java.util.Stack;

public class minStack {

    static Stack<int[]> st = new Stack<>();
    static int size =0;
    static void push(int x){
          if( st.isEmpty()){
            st.push(new int[]{ x, x});
          }else{
            int min = Math.min(x, st.peek()[1]);
            st.push(new int[]{x,min});
          }
          size++;
          return;

    }

    static void pop(){

        st.pop();
        size--;
        return;
    }

    static int top(){

        return st.peek()[0];
    }

    static int getMinElement(){
        return st.peek()[1];
    }

    static void printStack(){
        for( int i=0; i< st.size(); i++){
            System.out.print(st.get(i)[0] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        push(4);
        push(5);
        push(6);

        printStack();  // prints: 4 5 6

        pop();

        printStack();  // prints: 4 5

        System.out.println("Top: " + top());
        System.out.println("Min: " + getMinElement());
        
    }
    
}
