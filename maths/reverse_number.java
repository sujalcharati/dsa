package maths;

import java.util.Scanner;

public class reverse_number {
    
    static int reverseNumber(int number){
         
        int digit = Math.abs(number);
        int rev =0;

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
