

// number hashing

package hashing;

// import java.util.Scanner;

// public class basics {
//     public static void main(String[] args) {
//         System.out.println("Enter the size of the array");
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         System.out.println("Enter the elements of the array");
//         Scanner sc1 = new Scanner(System.in);
//         int[] arr = new int[size];
//         for( int i=0; i< size; i++){
//             arr[i]= sc1.nextInt();

//         }

//         System.out.println("Enter the no of queries");
//         Scanner sc2 = new Scanner(System.in);
//         int query = sc2.nextInt();
//         int[] quer = new int[query];
//          for( int i=0; i< query; i++){
//             quer[i]= sc2.nextInt();

//         }

//         int[] hash = new int[13];
//         for(int i=0;i<size;i++){
//             hash[arr[i]]+=1;
//         }

//         for(int i=0; i<query; i++){
//             System.out.println(quer[i] + " occurs " + hash[quer[i]] + " times");
//         }

//     }

// }

// import java.util.Scanner;

// public class basics{

//     public static void main(String[] args) {
//         String str = "aabsdsfasd";
//         int size = str.length();
//         int count = 0;
//         int j = 0;

//         for (int i = j+1; i < size; i++) {
//             if (str.charAt(i) == str.charAt(j)) {
//                 count++;
//             }
//         }
//     }

// }

//character hashing :

// import java.util.Scanner;

// public class basics {

//     public static void main(String[] args) {
//         System.out.println("Enter the string");
//         Scanner sc1 = new Scanner(System.in);
//         String str = sc1.nextLine();
//         int len = str.length();

//         int[] hash = new int[256];
//         for (int i = 0; i < len; i++) {
//             hash[str.charAt(i)]++;
//         }

//         System.out.println("Enter the number of queries");
//         int query = sc1.nextInt();
//         sc1.nextLine(); // consume leftover newline

//         for (int i = 0; i < query; i++) {
//             System.out.println("Enter character to query:");
//             String q = sc1.nextLine();
//             char ch = q.charAt(0);
//             System.out.println(ch + " occurs " + hash[ch] + " times");
//         }
//     }
// }

// interger and character hashing by using Hashmap:

//integer hashing  

// import java.util.*;

// public class basics {
//     public static void main(String[] args) {
//         System.out.println("Enter the size of the array");
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         System.out.println("Enter the elements of the array");
//         Scanner sc1 = new Scanner(System.in);
//         int[] arr = new int[size];
//         for( int i=0; i< size; i++){
//             arr[i]= sc1.nextInt();

//         }

//         System.out.println("Enter the no of queries");
//         Scanner sc2 = new Scanner(System.in);
//         int query = sc2.nextInt();
//         int[] quer = new int[query];
//          for( int i=0; i< query; i++){
//             quer[i]= sc2.nextInt();

//         }

//         HashMap<Integer,Integer> hash = new HashMap<>();
//         for(int i = 0; i < size; i++) {
//             hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
//         }

//         for(int i=0; i<query; i++){
//             System.out.println(quer[i] + " occurs " + hash.getOrDefault(quer[i], 0) + " times");
//         }




//     }
    
// }



//