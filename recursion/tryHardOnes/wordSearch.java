// class Solution {

//     public boolean exist(char[][] board, String word) {

//         int rows = board.length;
//         int cols = board[0].length;


//         for( int i=0; i< rows; i++){

//             for( int j=0;j< cols; j++){

//                 if( board[i][j] == word.charAt(0) && find(board,0,i,j,word)){
//                     return true;
//                 }
//             }
//         }
        
//         return false;

        
//     }

//     public boolean find( char[][] board,int index, int i, int j, String word){

//         if( index == word.length()){
//             return true;
//         }

//         if( i < 0 || j < 0  || i >= board.length || j >= board[0].length || board[i][j] == '$'){
//             return false;
//         }

//         if( board[i][j] != word.charAt(index)){
//             return false;
//         }

//         char temp = board[i][j];
//         board[i][j] ='$';

//         int[] dr = {-1,0,1,0};
//         int[] dc = {0,1,0,-1};

//         for( int d=0; d <4; d++){

//             int newi = i+dr[d];
//             int newj = j+dc[d];

//             if( find(board, index+1, newi, newj, word)){
//                 return true;
//             }
//         }

//         board[i][j] = temp;
//         return false;
//     }
// }