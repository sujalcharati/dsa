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
