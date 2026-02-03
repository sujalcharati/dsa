package stackANDqueue.fundamentalsQuestion;

import java.util.*;
public class reverseString {


  public static void main(String[] args) {
    
    String str = "sujal";

    Stack<Character> st = new Stack<>();

    for( int i=0; i< str.length();i++){

        st.push(str.charAt(i));
    }

    for( int i=0;i < str.length();i++){

        char ch = st.peek();
        st.pop();
        System.out.print(ch); // lajus
    }

    
  }
    
}
