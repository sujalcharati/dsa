// brute force
// package maths;

// import java.util.Arrays;

// public class print_all_divisors {
   

//     static int[] printDivisors(int num ){
        


//         int count=0;

//         for(int i=1;i<=num;i++){
//             if(num %i == 0){
//                 count++;
//             }
//         }

//         int[] ans = new int[count];

//         for(int i = 1; i <= num; i++){
//             int index=0;
//             if(num % i == 0){
//                 ans[index++]=i;
//             }
//           }

//           return ans;
//     }
  
//     public static void main(String[] args) {
//         int num = 9;
//         int[] data =printDivisors(num);
//         System.out.println(Arrays.toString(data));
//     }
// }




package maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class print_all_divisors {
   

    static List<Integer> printDivisors(int num ){
        
        List<Integer> divisors = new ArrayList<>();

        for(int i=1; i*i <=num; i++){
            if(num %i ==0){
                divisors.add(i);
                if(i != num/i){
                    divisors.add(num/i);
                }
            }
        }
        Collections.sort(divisors);

        return divisors;
    }
  
    public static void main(String[] args) {
        int num = 9;
        List<Integer> data =printDivisors(num);
        System.out.println(data.toString());
    }
}
