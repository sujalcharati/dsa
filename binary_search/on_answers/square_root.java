// Brute force method :

// package binary_search.on_1d_array.on_answers;

// import java.util.*;

// public class square_root {

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
//         System.out.print(" Enter a number:");
//         int val = sc.nextInt();

//         for( int i=0; i<= val; i++){
//             if( i*i == val) {
//                 System.out.println(i);
//               break;
//             }
//             if ( i*i > val) {
//                 System.out.println( i-1);
//                 break;
//             }

//         }

//     }
    
// }



// better approach 

package binary_search.on_answers;

import java.util.*;

public class square_root {

    public static int findSQRT( int val){

        int left = 0;
        int right = val;
        int ans =0;

        while( left < right){

            int mid = left+ ( right-left)/2;
            int anss = mid*mid;

            if( anss == val ) return mid;
            else if( anss > val) right = mid-1;
            else {
                ans =mid;
                left = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number:");
        int val = sc.nextInt();

        int ans = findSQRT(val);
        System.out.println(ans);

    }
    
}
