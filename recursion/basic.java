// base condition 

// package recursion;

// public class basic {
//     static int cut =0;
//     static void printfunc(){
   
//         if (cut == 4){
//             return;
//         }
//         System.out.println(cut);
//         cut++;
//         printfunc();
//     }
//     public static void main(String[] args) {
//         System.out.println(" process started");
//         printfunc();
//     }
    
// }


// print name five times 

// package recursion;

// import java.util.Scanner;

// public class basic {
//     // static int no = 1;
//     // static void printname(String name){
   
//     //     if (no == 6){
//     //         return;
//     //     }
//     //     System.out.println(name);
//     //     no++;
//     //     printname(name);

//     static void printname(int i,int n){

//         if (i>n){
//             return;
//         }
//         System.out.println("sujal");
//         printname(i+1, n);
   

//     }
    
//     public static void main(String[] args) {
//         System.out.println(" process started");
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" enter the number of time ");
//         int n= sc.nextInt();
//         int i=1;
//         printname(i,n);
//     }
    
// }



// print numbers from 1 to n


// package recursion;

// import java.util.Scanner;

// public class basic {

//     static void printnumber(int i,int n){

//         if (i>n){
//             return;
//         }
//         System.out.println(i);
//         printnumber(i+1, n);
   

//     }
    
//     public static void main(String[] args) {
//         System.out.println(" process started");
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" enter the number of time ");
//         int n= sc.nextInt();
//         int i=1;
//         printnumber(i,n);
//     }
    
// }


// print from N to 1

// package recursion;

// import java.util.Scanner;

// public class basic {

//     static void printnumber(int n){

//         if (n<=0){
//             return;
//         }
//         System.out.println(n);
//         n-=1;
//         printnumber(n);
   

//     }
    
//     public static void main(String[] args) {
//         System.out.println(" process started");
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" enter the number of time ");
//         int n= sc.nextInt();
//         printnumber(n);
//     }
    
// }


//  print 1 to N by backtracking ...

// package recursion;

// import java.util.Scanner;

// public class basic {

//     static void printnumber(int i,int n){

//         if (i<1){
//             return;
//         }
//         printnumber(i-1,n);  // function call is happening this will stop when i becomes 0 as 0<1 is false
//         System.out.println(i);
   

//     }
    
//     public static void main(String[] args) {
//         System.out.println(" process started");
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" enter the number of time ");
//         int n= sc.nextInt();
//         printnumber(n,n);
//     }
    
// }




//  print N to 1 by backtracking...


// package recursion;

// import java.util.Scanner;

// public class basic {

//     static void printnumber(int i,int n){

//         if (i>n){
//             return;
//         }
//         printnumber(i+1,n);  // function call is happening this will stop when i becomes n+1 
//         System.out.println(i);
    

//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" enter the number of time ");
//         int n= sc.nextInt();
//         int i = 1;
//         printnumber(i,n);
//     }
    
// }



// sum of first N numbers  by parameterized way ...



// package recursion;

// import java.util.Scanner;

// public class basic {

//     static void sum(int i,int sum){

//         if (i<1){
//             System.out.println(sum);
//             return;
//         }

//         sum(i-1,sum+i);
    

//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" enter the number of time ");
//         int n= sc.nextInt();
//         int sum=0;
//         sum(n,sum);
//     }
    
// }



// sum of first N numbers  by functional way ...



// package recursion;

// import java.util.Scanner;

// public class basic {

//     static int sum(int i){

//         if (i==0){
//             return 0;
//         }
//        return i+sum(i-1);    

//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" enter the number of time ");
//         int n= sc.nextInt();
//         System.out.println(sum(n));
//     }
    
// }



// factorial of first N numbers ...

// package recursion;

// import java.util.Scanner;

// public class basic {

//     static int factorial(int i){

//         if (i==1){
//             return 1;
//         }
//        return i*factorial(i-1);    

//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println(" enter the number of time ");
//         int n= sc.nextInt();
//         System.out.println(factorial(n));
//     }
    
// }



// reverse an array without recursion

// public class basic {



//     public static void main(String[] args) {
        
//         int arr[] = {2, 3, 4};

//         int first = 0;
//         int last = arr.length - 1;

//         while (first < last) {
//             int temp = arr[first];
//             arr[first] = arr[last];
//             arr[last] = temp;
//             first++;
//             last--;
//         }

//         System.out.println(java.util.Arrays.toString(arr));

//     }

     
// }


//reverse an array with recursion using two pointers 

// public class basic {


//     static void arrayReverse(int left ,int right,int[] arr){

//         if (left >= right) {
//             return;
//         }
//         int temp = arr[left];
//         arr[left] = arr[right];
//         arr[right]= temp;
//         arrayReverse(left + 1, right - 1, arr);
//     }


//     public static void main(String[] args) {
        
//         int arr[] = {2, 3, 4};

//         int first = 0;
//         int last = arr.length - 1;
//         arrayReverse(first,last,arr);
//         System.out.println(java.util.Arrays.toString(arr));
//     }

     
// }




// reverse an array with recursion with single pointer 

// import java.util.Scanner;

// public class basic {


//     static void arrayReverse(int i,int[] arr){

//         int n = arr.length;

//         if (i >= n/2) {
//             return;
//         }

//         int temp = arr[i];
//         arr[i] = arr[n-i-1];
//         arr[n-i-1]= temp;
//         arrayReverse(i+1, arr);
//     }


//     public static void main(String[] args) {
        
//         // int arr[] = {2, 3, 4};
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of the array:");
//         int size = sc.nextInt();
//         int arr[] = new int[size];

//         System.out.println("Enter the elements of the array:");
//         for(int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int i = 0;
//         arrayReverse(i, arr);
//         System.out.println(java.util.Arrays.toString(arr));
//     }

     
// }


// check palindrome with the help of recursion 


// import java.util.Scanner;
// public class basic {


//     static boolean checkPalindrome(String string,int n,int i){

//         if(i >=n/2){
//             return true;
//         }

//     if(string.charAt(i) != string.charAt(n-i-1)){
//              return false;

//     }
//        return checkPalindrome(string,n,i+1);    
//     }


//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the string:");
//         String string = sc.nextLine();
//         int n = string.length();
//         int i=0;

//         System.out.println(checkPalindrome(string,n,i));

     
//     }

     
// }




// check the fibonacci series ...

import java.util.Scanner;

public class basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        arr[0] = 0;
        if (n > 0) arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.print("answer is :");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}