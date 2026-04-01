
// class Solution {
//     public List<String> letterCombinations(String digits) {

//         List<String> ans = new ArrayList<>();

//         if(digits.length() == 0 ) return ans;

//         String[] map = { "", "", "abc","def", "ghi", "jkl", "mno", "pqrs", "tuv","wxyz"};
//         findletterCombinations(0,ans,new StringBuilder(), digits, map);
//         return ans;
        
//     }

//     public void findletterCombinations(int index, List<String> ans, StringBuilder str, String digits, String[] map){

//         if( index == digits.length()){
//             ans.add(str.toString());
//             return;
//         }

//         String letters = map[digits.charAt(index)-'0'];

//         for( char ch: letters.toCharArray()){
//             str.append(ch);
//             findletterCombinations(index+1, ans, str, digits, map);
//             str.deleteCharAt(str.length()-1);
//         }


//     }
// }