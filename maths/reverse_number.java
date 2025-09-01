package maths;

import java.util.Scanner;

public class reverse_number {
    
    static int reverseNumber(int number){
         
        int digit = Math.abs(number);
        int rev =0;
        // int digit = number;

        while( digit >0){
            int first_digit =digit%10;
            rev = rev*10+first_digit;
            digit =digit/10;
        }

        return rev;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a number");
        int number = sc.nextInt();
        int revNum = reverseNumber(number);
        System.out.println(revNum);
    }
    
}




// handling the edge case of problem ie 32 bit signed number 

// class Solution {
//     public int reverse(int x) {
//         int rev = 0;

//         while( x!=0 ){
//             int last = x%10;
//             x = x/10;

//             if ( rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 &&  last >7) return 0;

//             if ( rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && last < -8 ) return 0 ;

//              rev = rev*10 + last;
//         }
  
//         return rev;
//     }
// }