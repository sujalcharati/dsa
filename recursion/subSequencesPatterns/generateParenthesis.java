// class Solution {
//     public List<String> generateParenthesis(int n) {


//         List<String> answer = new ArrayList<>();
//         backtrack(n, answer,"",0,0);
//         return answer;
        
//     }
//     public void backtrack(int n, List<String> answer, String current, int open, int close ){

//         if( current.length() == n*2){
//              answer.add(current);
//              return;
//         }

//         if( open < n){
//             backtrack(n,answer, current+"(", open+1,close);
//         }

//         if( close < open){
//             backtrack(n,answer,current+")",open,close+1);
//         }
//     }
// }