// for infix to prefix :
    //   a. reverse the String
    //   b. infix to postfix
    //   c. reverse the answer



package stackANDqueue.conversionProblems;

import java.util.Stack;

public class inToPrefixUsingStack {





    
          static  StringBuilder ans = new StringBuilder();
          static  Stack<Character> st = new Stack<>();
          
          static boolean isRightassociative( char c){
            return c=='^';
          }

          static int precedence( char c){

            switch (c) {
                case '^':
                   return 3;
                case '*':
                case '/':
                    return 2;
                
                case '+':
                case '-':
                    return 1;
            
                default:
                    return -1;
            }
          }


          static boolean isOperator( char c){

            return c == '+' || c == '-' || c == '*' || c == '/' ||  c=='^';
          }

    static String infixToPrefix( String str){

        for( char c : str.toCharArray()){

            if( Character.isLetterOrDigit(c)){
                ans.append(c);
            }
            else if( c =='('){
                st.push(c);
            }
            else if( c == ')'){
                while( !st.isEmpty() && st.peek() != '(' ){
                    ans.append(st.pop());
                }
                st.pop();
            }

            else if( isOperator(c) ){

                while( !st.isEmpty() && st.peek() != '(' &&( precedence(st.peek()) > precedence(c) && !isRightassociative(c)) ){

                   ans.append(st.pop());
                }
                st.push(c);


            }

        }

        while ( !st.isEmpty()) {
            ans.append(st.pop());
            
        }

        return ans.reverse().toString();
    }


    public static void main(String[] args) {
        
        String str = "((a-(b/c))*((a/k)-l))";
        StringBuilder revString = new StringBuilder();
        for( int i = str.length() - 1; i >= 0; i--){
            char c = str.charAt(i);
            if( c == '(') revString.append(')');
            else if( c == ')') revString.append('(');
            else revString.append(c);
        }
        System.out.println(revString.toString());

        String ans = infixToPrefix(revString.toString());
        System.out.println(ans);
    }

    
}
