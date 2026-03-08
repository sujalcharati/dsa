// brute force solution...

// class Solution {
//     public int characterReplacement(String s, int k) {
        
//         int n = s.length();
//         int longest = 0;
//         for( int i=0; i< n; i++){

//             int[] hash = new int[26];
//             int maxfreq = 0;
//             int count = 0;

//             for( int j=i; j < n; j++){
               
//                hash[s.charAt(j)-'A']++;
//                maxfreq = Math.max( maxfreq, hash[s.charAt(j)-'A']);
               
//                count = j-i+1-(maxfreq);

//                if( count <= k){
//                longest = Math.max( longest, j-i+1);

//                }

//             }
//         }

//         return longest;
//     }
// }




// optimal solution...



// class Solution {
//     public int characterReplacement(String s, int k) {
        
//         int n = s.length();
//         int longest = 0;
//         int l = 0;
//         int[] hash = new int[26];
//         int maxfreq = 0;

//         for( int r=0; r< n; r++){
        
//         hash[s.charAt(r)-'A']++;
//         maxfreq = Math.max( maxfreq, hash[s.charAt(r)-'A']);
         

//             while( (r-l+1)-maxfreq > k){
//                 hash[s.charAt(l)-'A']--;
//                 l++;
//             }

//             longest = Math.max(longest, r-l+1);

//         }

//         return longest;
//     }
// }