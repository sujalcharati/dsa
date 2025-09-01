package maths;

import java.util.Scanner;

public class palindrome {
    

    static boolean checkPalindrome(int num ){

        String str = String.valueOf(num);

        for(int i=0; i< str.length()/2 ; i++){
            if( str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number :");
        int num = sc.nextInt();
        boolean palindrome = checkPalindrome(num);
        System.out.println(palindrome);

    }
    
}
