// link to question : https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
// package pattern;

// public class a_to_z {

//     public static void main(String[] args) {
//         for(int i =0;i<5;i++){
//             for(int j=0;j<5;j++){

//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// package pattern;

// public class a_to_z {

//     public static void main(String[] args) {
//         for(int i =0;i<5;i++){
//             for(int j=0;j<=i;j++){

//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// package pattern;

// public class a_to_z {

//     public static void main(String[] args) {
//         for(int i =1;i<=5;i++){
//             for(int j=1;j<=i;j++){

//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// package pattern;

// public class a_to_z {

//     public static void main(String[] args) {
//         for(int i =1;i<=5;i++){
//             for(int j=1;j<=i;j++){

//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

// package pattern;

// public class a_to_z {

//     public static void main(String[] args) {
//         for(int i =5;i>=1;i--){
//             for(int j=1;j<=i;j++){

//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// package pattern;

// public class a_to_z {

//     public static void main(String[] args) {
//         for(int i =5;i>=1;i--){
//             for(int j=1;j<=i;j++){

//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// package pattern;

// public class a_to_z {

//     public static void main(String[] args) {

//         for (int i =0; i<5;i++){

//             for (int j=0; j< 5-i-1;j++){
//                 System.out.print("  ");
//             }
//             for (int k=0; k< 2*i+1;k++){
//                 System.out.print(" * ");
//             }
//             for( int l=0;l< 5-i-1;l++){
//                 System.out.print("");

//             }
//           System.out.println();
//         }
//     }
// }

// package pattern;

// public class a_to_z {

//     public static void main(String[] args) {

//         for (int i =5; i>0;i--){

//             for (int j=0; j< 5-i;j++){
//                 System.out.print("  ");
//             }
//             for (int k=0; k< 2*i-1;k++){
//                 System.out.print(" * ");
//             }
//             for( int l=0;l< 5-i;l++){
//                 System.out.print(" ");

//             }
//           System.out.println();
//         }
//     }
// }

// package pattern;

// public class a_to_z {

//     public static void main(String[] args) {

//             for(int j=0;j< 5;j++){

//                 for( int k=0;k< 5-j-1;k++){
//                     System.out.print(" ");
//                 }
//                 for( int k=0;k< 2*j+1;k++){
//                     System.out.print("*");
//                 }
//                 for( int k=0;k<= 5-j-1;k++){
//                     System.out.print(" ");
//                 }
//                 System.out.println();
//             }

//             for(int j=5;j>0;j--){

//                 for( int k=0;k< 5-j;k++){
//                     System.out.print(" ");
//                 }
//                 for(int k=0;k<2*j-1;k++){
//                     System.out.print("*");
//                 }
//                 for(int k=0;k< 5-j;k++){
//                     System.out.print(" ");
//                 }
//               System.out.println();
//             }

//           System.out.println();

//     }
// }

// package pattern;

// public class a_to_z {

//     public static void main(String[] args) {

//             for(int j=0;j< 5;j++){

//                 for( int k=0;k< j+1;k++){
//                     System.out.print("*");
//                 }

//                 System.out.println();
//             }

//             for(int j=5;j>0;j--){

//                 for( int k=0;k< j-1;k++){
//                     System.out.print("*");
//                 }

//               System.out.println();
//             }

//     }
// }

// public class a_to_z {

//     public static void main(String[] args) {

//          int start = 1;
//             for(int j=0;j< 5;j++){

//                 if( j%2 == 0){
//                     start=1;
//                 } else{
//                     start =0;
//                 }

//                 for( int i=0;i<=j;i++){
//                     System.out.print(start);
//                     start=1-start;
//                 }
//             System.out.println();
//             }

//     }
// }

// public class a_to_z {

//     public static void main(String[] args) {

//             for(int j=0;j< 4;j++){

//                for(int i=0; i <=j;i++){
//                 System.out.print(i+1);
//                }
//                for(int i=0; i< 2*(3-j);i++){
//                 System.out.print(" ");
//                }
//                for(int i=j;i>=0;i--){
//                 System.out.print(i+1);
//                }
//             System.out.println();
//             }

//     }
// }

// public class a_to_z {

//     public static void main(String[] args) {

//         int sum =1;
//             for(int i=0;i<5;i++){

//                 for(int j=0;j<=i;j++){
//                    System.out.print(sum);
//                    sum++;
//                 }

//             System.out.println();
//             }

//     }
// }



// public class a_to_z {

//     public static void main(String[] args) {
//         for (char i = 'A'; i <= 'E'; i++) {

//             for (char j = 'A'; j <= i; j++) {
//                 System.out.print(j);
//             }

//             System.out.println();
//         }

//     }
// }





// public class a_to_z {

//     public static void main(String[] args) {
//         for (char i = 'E'; i >= 'A'; i--) {

//             for (char j = 'A'; j <= i; j++) {
//                 System.out.print(j);
//             }

//             System.out.println();
//         }

//     }
// }



// public class a_to_z {

//     public static void main(String[] args) {
//         for (char i = 'A'; i <= 'E'; i++) {

//             for (char j = 'A'; j <=  i; j++) {
//                 System.out.print(i);
//             }

//             System.out.println();
//         }

//     }
// }



// public class a_to_z {

//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 System.out.print(" ");
//             }
//             char ch = 'A';
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(ch);
//                 ch++;
//             }
//             ch -= 2;
//             for (int j = 0; j < i; j++) {
//                 System.out.print(ch);
//                 ch--;
//             }
//             // Print trailing spaces (optional)
//             for (int j = 0; j < n - i - 1; j++) {
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
// }


