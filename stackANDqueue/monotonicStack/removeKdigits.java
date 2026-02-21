// class Solution {
//     public String removeKdigits(String num, int k) {

//         Stack<Character> st = new Stack<>();

//         for( int i=0; i < num.length(); i++){

//             while( !st.isEmpty() && num.charAt(i) < st.peek() && k > 0){
//                 st.pop();
//                 k--;
//             }

//             st.push(num.charAt(i));
//         }

//         while( !st.isEmpty() && k >0){
//             st.pop();
//             k--;
//         }

//         StringBuilder sb = new StringBuilder();

//         while( !st.isEmpty()){
//             sb.append(st.pop());
//         }

//         sb.reverse();


//         int i=0;
//         while( i < sb.length() && sb.charAt(i) == '0'){
//             i++;
//         }

//         String res =  sb.substring(i);

//         return res.length() == 0 ? "0" : res;
        
//     }
// }


// public class removeKdigits {
    
// }
