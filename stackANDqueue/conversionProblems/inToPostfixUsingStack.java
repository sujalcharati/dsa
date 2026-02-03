package stackANDqueue.conversionProblems;

import java.util.Stack;

public class inToPostfixUsingStack {

    boolean isRightassociative( char c){

        return c == '^';
    }
        

    int precedence( char c){

        switch (c) {
            case '^':
                return 3;
            
            case '+' :
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
    
     boolean isOperator( char c){
                return c=='+' || c == '-' || c == '*' || c == '/' || c == '^';
            }

    String infixToPostfix( String str){



        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for( char c: str.toCharArray()){

            if( Character.isLetterOrDigit(c)){
                ans.append(c);
            }

            else if( c == '('){
                st.push(c);
            }

            else if( c == ')'){
                while( !st.isEmpty() && st.peek() != '('){
                    ans.append(st.pop());
                }
                st.pop();
            }

            else if( isOperator(c)){

                while (!st.isEmpty() && st.peek() != '(' &&
                       (precedence(st.peek()) > precedence(c) ||
                        (precedence(st.peek()) == precedence(c) && !isRightassociative(c)))) {
                    ans.append(st.pop());
                }
                st.push(c);

            }


        }

        while ( !st.isEmpty()) {

            ans.append(st.pop());
            
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        inToPostfixUsingStack sol = new inToPostfixUsingStack();
        System.out.println(sol.infixToPostfix(str));  //abcd^e-fgh*+^*+i-
    }
    
}
