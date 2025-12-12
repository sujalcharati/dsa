
package array.medium;

import java.util.Arrays;

public class setMatrixZeros {

    public static void main(String[] args) {
        
     int[][] matrix = {{1,2,3},{3,0,4},{2,3,9}};
     int size = matrix.length;
     int row = matrix.length;
     int col = matrix[0].length;

     boolean[] row_zero = new boolean[size];
     boolean[] col_zero = new boolean[size];


     for( int i=0; i < row; i++){
        for( int j=0; j< col ; j++ ){

            if( matrix[i][j] == 0){
                row_zero[i] = true;
                col_zero[j] = true;
            }
        }
     }

     for( int i=0; i < row; i++){

        if( row_zero[i]){

            for( int j=0; j< col; j++){
                matrix[i][j] =0;
            }
        }
     }

     for( int j=0; j< col;j++){

        if( col_zero[j]){

            for( int i=0;i < row; i++){
                matrix[i][j] =0;

            }
        }
     }

     for( int i=0;i<row; i++){
        for( int j=0; j< col ; j++){
            System.out.print(matrix[i][j]);
        }
        System.out.println();
     }
     

    }

     
}