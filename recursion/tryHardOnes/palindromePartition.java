// class Solution {
//     public List<List<String>> partition(String s) {
//         //your code goes here
//         List<List<String>> ans = new ArrayList<>();

//         listPalindrome(0, ans, new ArrayList<>(),s);
//         return ans;
        
//     }

//     public boolean isPali( String str){
//         int i=0;
//         int j= str.length()-1;
//         while( i < j){

//             if( str.charAt(i) != str.charAt(j)){
//                 return false;
            
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }

//     public void listPalindrome(int index, List<List<String>> ans, List<String> ds, String s){

//         if ( index == s.length() ){
//             ans.add(new ArrayList<>(ds));
//             return;
//         }

//         for( int i = index; i < s.length(); i++){
  
//          String sub = s.substring(index, i+1);
//             if( isPali(sub)){
//              ds.add(sub);
//             listPalindrome(i+1, ans, ds,s);
//             ds.remove(ds.size()-1);

//             }
//         }
//     }
// }
