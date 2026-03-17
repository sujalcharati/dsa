// brute force solution ...

// class Solution {
//     public String minWindow(String s, String t) {
        
        

//         int smallest = Integer.MAX_VALUE;
//         String result = "";

//         for( int i=0; i < s.length(); i++){

//             HashMap<Character, Integer> mapp = new HashMap<>();

//             for(  i=0; i< t.length(); i++){
//             mapp.put( t.charAt(i), mapp.getOrDefault(t.charAt(i), 0)+1);
//              }

//             for( int j=i; j< s.length(); j++){

//                 Character cha = s.charAt(j);
                 
//                  if( mapp.containsKey(cha)){
                 
//                  mapp.put(cha, mapp.get(cha)-1);

//                  if( mapp.get(cha) == 0){
//                     mapp.remove(cha);
//                  }
//                  }

//                  if( mapp.isEmpty()){

//                     if( j-i+1 < smallest){
//                         smallest = j-i+1;
//                         result = s.substring(i,j+1);
//                     }

//                     break;
//                  }

//             }
//         }

//         return result;
//     }
// }


// optimal solution .....


