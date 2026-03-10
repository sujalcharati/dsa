// brute force solution ....



// class Solution {
//     public int kDistinctChar(String s, int k) {
//         //your code goes here
//         int n = s.length();
//         int longest = 0;

//         for( int i=0; i < n; i++){

//             Set<Character> sett = new HashSet<>();

//             for( int j=i; j < n; j++){
            

//             sett.add(s.charAt(j));
               
//               if( sett.size() > k){

//               longest = Math.max( longest, (j-1)-i+1);
//               break;
//               }

//             }
//         }

//         return longest;
//     }
// }




// optimal solution .....


// class Solution {
//     public int kDistinctChar(String s, int k) {
//         //your code goes here


//         int l =0;

//         HashMap<Character, Integer> mapp = new HashMap<>();
//         int longest  = 0;
        
//         for( int r=0; r < s.length(); r++){

//          mapp.put( s.charAt(r), mapp.getOrDefault(s.charAt(r),0)+1);

//          while( mapp.size() > k){

//             mapp.put( s.charAt(l), mapp.get(s.charAt(l))-1);

//             if( mapp.get(s.charAt(l))==0){
//                 mapp.remove(s.charAt(l));
//             }

//             l++;
//          }

//          longest = Math.max( longest, r-l+1);

//         }

//         return longest;
//     }
// }
