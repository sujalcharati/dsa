package stack.fundamentalsQuestion;

import java.util.Stack;

public class validParenthesis {


    static boolean isValidParethesis( String str, Stack st){


        for( int i=0; i< str.length();i++){

            if( str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '('){
                  st.push(str.charAt(i));
            } 

            if( str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')'){
                char top = (char) st.peek();

                if( st.size() == 0) return false;

                if( str.charAt(i) == '}' && top == '{' || str.charAt(i) == ']' && top == '[' || str.charAt(i) == ')' && top == '('){
                    st.pop();
                }else{
                    return false;
                }

            }
        }
        return true;

    }

    public static void main(String[] args) {
        
        String str = "{{(()]}}";
        Stack st = new Stack<>();

        boolean ans = isValidParethesis(str,st);
        if( ans) System.out.println(" its a valid parenthesis..");
        else System.out.print(" not a valid parentheseis...");
    }
    
}
