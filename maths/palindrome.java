// // general approach ...

// package maths;

// import java.util.Scanner;

// public class palindrome {
    

//     static boolean checkPalindrome(int num ){

//         String str = String.valueOf(num);

//         for(int i=0; i< str.length()/2 ; i++){
//             if( str.charAt(i) != str.charAt(str.length()-i-1)){
//                 return false;
//             }
//         }

//         return true;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print(" Enter a number :");
//         int num = sc.nextInt();
//         boolean palindrome = checkPalindrome(num);
//         System.out.println(palindrome);

//     }
    
// }





// // approach with half reversed number ...

// class Solution {
//     public boolean isPalindrome(int x) {
       
//         if( x < 0 ||  x%10 == 0 && x!=0 ){
//                 return false;
//             }

//        int reverse = 0;
//         while( x > reverse){

           
//             reverse = reverse*10+x%10;
//             x = x/10;

//         }

//         return ( x == reverse || x == reverse/10 );

        
//     }
// }