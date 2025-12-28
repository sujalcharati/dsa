// brute force method:

package binary_search.on_answers;

public class nthRootNumber {

    public static int findRootNumber( int M, int N){

        for( int i=0;i< M;i++){
            if( Math.pow(N, i) == M) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        
        int N =4;
        int M= 256;

        int val = findRootNumber( M,N);
        System.out.println(val);
    }
    
}



