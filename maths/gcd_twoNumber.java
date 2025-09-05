// tried out equilateral algorithm for better time complexity...

// package maths;

// public class gcd_twoNumber {

//     static int gcdofNumbers(int n1, int n2){
//         while ( n1>0 && n2>0) {
//             if( n1> n2) n1 = n1%n2;
//             else n2 =n2%n1;

//         }
//         if( n1 == 0) return n2;
//         return n1;    
//         }


//     public static void main(String[] args) {
//         int n1 = 8;
//         int n2 = 12;
//         int gcd = gcdofNumbers(n1,n2);
//         System.out.println("The gcd of two number is :"+gcd);
//     }
    
// }



// tried out brute force ..


package maths;

public class gcd_twoNumber {

    static int gcdofNumbers(int n1, int n2){
        
        int gcd = 1;
        int min = Math.min(n1, n2);
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
            gcd = i;
            }
        }
        return gcd;

    }

    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 40;
        int gcd = gcdofNumbers(n1,n2);
        System.out.println("The gcd of two number is :"+gcd);
    }
    
}


