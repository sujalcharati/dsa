// finding pascal's triagle ...

package array.hard;
import java.util.*;
public class pascalsTriangle {

    public static List<List<Integer>> findPascalTriangle(int N){
          
        List<List<Integer>> ans = new ArrayList<>();

        for( int i=0; i< N; i++){
            List<Integer> temp = new ArrayList<>();
            long val =1;
            for( int j=0 ; j<=i;j++){
                temp.add((int)val);
                val = val*( i-j)/(j+1);
            }
            ans.add(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        int N =5;
        List<List<Integer>> ans = findPascalTriangle(N);
        System.out.println(ans);
    }
    
}


// output : [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]


