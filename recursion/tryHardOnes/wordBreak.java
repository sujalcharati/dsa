

// class Solution {
//     public boolean wordBreak(String s, List<String> wordDict) {
//         // Your code goes here

//         if( s.length() == 0) return true;

//         for( int i=1; i<= s.length(); i++){

//             String sub = s.substring(0,i);

//             if( wordDict.contains(sub) && wordBreak(s.substring(i), wordDict)){
//                 return true;
//             }
//         }
//         return false;
//     }
// }