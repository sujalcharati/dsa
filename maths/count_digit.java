package maths;

import java.util.Scanner;

public class count_digit {

    static int count_digits(int digit) {
        int count =0;
        int n = Math.abs(digit);
        if(n==0) return 1;
        else{
            while ( n >0) {
                count++;
                n=n/10;
            }
        }
        return count;
     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the digit");
        int digit = sc.nextInt();
        int count = count_digits(digit);
        System.out.println(" the number of digits is "+ count);
}
}