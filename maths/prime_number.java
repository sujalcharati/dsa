package maths;

import java.util.*;
public class prime_number {

    static boolean isprime(int num){

       double n = Math.sqrt(num);
       for(int i=2;i<=n;i++){
        if(num%i == 0){
            return false;
        }
       }
       return true;

    }

    public static void main(String[] args) {
      
        int num = 4;
        boolean val =isprime(num);
        System.out.println(val);
    }
    
}
