


// class Solution {
//     public void reverseStack(Stack<Integer> st) {
//         // Your code goes here

//         if( st.isEmpty()){
//             return;
//         }

//             int elem = st.pop();

//             reverseStack(st);
//             insertElement(st, elem);


//     }

//     public void insertElement( Stack<Integer> st, int elem){

//         if( st.isEmpty()){
//             st.push(elem);
//             return;
//         }

//         int top = st.pop();
//         insertElement(st, elem);
//         st.push(top);
//     }
// }