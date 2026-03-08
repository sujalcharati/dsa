// brute force :


// class Solution {
//     public int numberOfSubstrings(String s) {

//         int count =0;
//         int n = s.length();
//         for( int i=0; i <n; i++){
//         int a_got = 0;
//         int b_got = 0;
//         int c_got = 0;

//             for( int j=i; j< n; j++){


//                 if( s.charAt(j) == 'a'){
//                     a_got = 1;
//                 } else if( s.charAt(j) == 'b'){
//                     b_got = 1;
//                 } else {
//                     c_got = 1;
//                 }

//                 if( a_got == 1 & b_got == 1 & c_got ==1){
//                     count++;
//                 }


//             }
//         }
//         return count;
        
//     }
// }



// optimal solution ....


