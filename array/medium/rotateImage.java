// not in place method .

// package array.medium;

// public class rotateImage {

//     public static void main(String[] args) {
        
//         int[][] matrix = { {1,2,3},{4,5,6},{7,8,9}};

//         int row = matrix.length;
//         int col = matrix[0].length;

//         int[][] ans = new int[row][col];

//         for(int i=0;i< row; i++){
//             for( int j=0; j< col; j++){
//                 ans[j][row-i-1] = matrix[i][j];
//             }
//         }

//         for( int i=0; i < row; i++){
//             for( int j=0; j< col; j++){
//                 System.out.print(ans[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
    
// }



// using in-place method :

package array.medium;

public class rotateImage {

    public static void main(String[] args) {
        
        int[][] matrix = { {1,2,3},{4,5,6},{7,8,9}};

        int row = matrix.length;
        int col = matrix[0].length;


        for(int i=0;i< row; i++){
            for( int j=i+1; j< col; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for(int i=0; i<row; i++){
          int left=0;
          int right = row-1;
            while( left < right ){
              int temp = matrix[i][left];
              matrix[i][left] = matrix[i][right];
              matrix[i][right] = temp;
              left++;
              right--;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
      }
    }
    

