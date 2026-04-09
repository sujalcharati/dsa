// class Solution {
//     public void solveSudoku(char[][] board) {

//         solve(board);
//     }

//     public boolean solve(char[][] board){


//         for( int i=0; i < board.length; i++){

//             for( int j=0; j < board[0].length; j++){

//                 if( board[i][j] == '.'){

//                     for( char ch = '1'; ch <= '9'; ch++){

//                         if( isValid( board, i, j , ch)){

//                             board[i][j] = ch;

//                             if( solve(board)) return true;

//                             board[i][j] = '.';
//                         }
//                     }

//                     return false;

//                 }
//             }
//         }

//         return true;


//     }

//     public boolean isValid( char[][] board, int i, int j, char ch){


//         for( int col =0; col< 9; col++){
            
//             if( board[i][col] == ch) return false;

//         }

//          for( int row=0; row< 9; row++){
            
//             if( board[row][j] == ch) return false;

//         }

//         int startrow = (i/3)*3;
//         int startcol = (j/3)*3;

//         for( int row = startrow; row < startrow+3; row++){

//             for( int col = startcol; col < startcol+3; col++){

//                 if( board[row][col] == ch) return false;
//             }
//         }

//         return true;
//     }

// }
