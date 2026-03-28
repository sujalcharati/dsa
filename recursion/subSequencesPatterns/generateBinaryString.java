// 



// class Solution {
//     public List<String> generateBinaryStrings(int n) {
//         // Your code goes here
//         List<String> result = new ArrayList<>();
//         helper(n,"",'0',result);
//         return result;
//     }


//     public void helper(int n, String current, char prev, List<String> result){

//         if( current.length() == n){
//             result.add(current);
//             return;
//         }

//         helper(n,current+"0",'0',result);

//         if( prev != '1'){
//             helper(n, current+"1", '1',result);
//         }
//     }
// }