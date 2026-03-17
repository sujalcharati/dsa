// brute force solution ...



// class Solution {
//     public int countGoodNumbers(long n) {
         
//          long output = 1;
//          final long mod = 1000000007;

//         for( int i=0; i< n ; i++){

//             if( i % 2 == 0){
//                output = (output*5) % mod;
//             } else {
//                 output = (output*4 )% mod;
//             }
//         }
//         return (int) output;
//     }
// }



//  optimal solution ...



// class Solution {

//     static final long mod = 1000000007;

//     public int countGoodNumbers(long n) {

//         long ne = (n+1)/2;
//         long no = (n)/2;

//         long evenpart = power(5,ne);
//         long oddpart = power(4,no);

//         return (int) ((evenpart*oddpart)% mod);
        
//     }

//     public long power( long base, long exp){

//         long ans = 1;

//         while( exp > 0 ){

//             if( exp %2 == 1){

//                 ans = (ans*base) % mod;
//             }

//             base = (base*base) %mod;
//             exp/=2;
//         }

//         return ans;
//     }
// }

