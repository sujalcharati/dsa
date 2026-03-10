package medium;
// brute force solution using hashSet ....


// class Solution {
//     public int lengthOfLongestSubstring(String s) {
        
//         int max_len =0;
//         for( int i=0; i < s.length(); i++){
            
//             int len = 0;
//             HashSet<Character> set = new HashSet<>();

//             for( int j=i; j< s.length(); j++){

//                 char last = s.charAt(j);

//                 if( !set.contains(last)){
//                     set.add(last);
//                     len++;
//                     max_len = Math.max( max_len, len);
//                 }

//                 else{
//                     break;
//                 }
//             }
//         }
//         return max_len;
        
//     }
// }


// brute force solution using hashing concepts ....



// class Solution {
//     public int lengthOfLongestSubstring(String s) {

//         int max_len = 0;
//         for( int i=0; i < s.length(); i++){
//         int[] hash = new int[256];
//             int len =0;

//             for( int j=i; j < s.length(); j++){
                
//                 if( hash[s.charAt(j)] == 1){
//                     break;
//                 }
//                 len = j-i+1;
//                 max_len = Math.max(len, max_len);
//                 hash[s.charAt(j)] = 1;

//             }
//         }
//         return max_len;
        
//     }
// }


// optimal solution with mapping...



// class Solution {
//     public int lengthOfLongestSubstring(String s) {

//         int n = s.length();
//         int maxlen = 0;
//         int l =0;
//         int r =0;
//         HashMap<Character, Integer> mapp = new HashMap<>();

//         while( r < n){

//             int len =0;
              
//             if( mapp.containsKey( s.charAt(r))){

//                 l = Math.max(l, mapp.get(s.charAt(r))+1);

//                 mapp.put(s.charAt(r),r);

//             }
//             mapp.put(s.charAt(r), r);
//             len = r-l+1;
//             maxlen = Math.max(len, maxlen);
//             r++;
//         }

//         return maxlen;
        
//     }
// }