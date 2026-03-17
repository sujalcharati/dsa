// brute force solution :


// class Solution {
//     public void sortStack(Stack<Integer> st) {
//         // Your code goes here
//         Stack<Integer> temp = new Stack<>();

//         while( !st.isEmpty()){

//             int elem = st.pop();

//             while( !temp.isEmpty() && temp.peek() < elem ){
                   
//                    st.push(temp.pop());

//             }

//             temp.push(elem);
//         }

//         while( !temp.isEmpty()){
//             st.push(temp.pop());
//         }
//     }
// }



// recursive solution ...




// class Solution {
//     public void sortStack(Stack<Integer> st) {
//         // Your code goes here

//         if( st.isEmpty()) return ;

//         int elem = st.pop();

//         sortStack(st);

//         insertStackElement(st, elem);
//     }

//     public static void insertStackElement( Stack<Integer> st, int element){

//         if( st.isEmpty() || st.peek() < element){
//               st.push(element);
//               return;
//         }

//         int top = st.pop();

//         insertStackElement(st, element);
//         st.push(top);
//     }
// }