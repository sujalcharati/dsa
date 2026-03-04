// brute force solution ....



// class Solution {
//     public int celebrity(int[][] M) {

//         int cols = M[0].length;
//         int rows = M.length;
//         int[] iknow = new int[cols];
//         int[] knowsme = new int[cols];

//         for( int i=0; i< rows; i++){

//             for( int j=0; j < cols; j++){

//                 if( M[i][j] == 1){
//                     iknow[i]++;
//                     knowsme[j]++;
//                 }
//             }
//         }

//         for( int i=0; i< cols; i++ ){
//             if( iknow[i] ==0 && knowsme[i] == cols-1){
//                 return i;
//             }
//         }
      
//         return -1;
//     }
// }





// optimal solution ...


// class Solution {
//     public int celebrity(int[][] M) {

//         int top = 0;
//         int bottom = M.length-1;

//         while( top < bottom){

//             if(M[top][bottom] == 1){
//                 top++;
//             } else if( M[bottom][top] == 1){
//                 bottom--;
//             } else {
//                 top++;
//                 bottom--;
//             }
//         }

//         if( top > bottom) return -1;

//         for( int i=0; i <= bottom; i++){

//             if( i == top) continue;

//             if( M[top][i] == 1 || M[i][top] = 0){
//                 return -1;
//             }
//         }
//         return top;
      
//     }
// }