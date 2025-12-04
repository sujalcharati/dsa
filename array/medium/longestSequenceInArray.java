// brute force solution : 

// package array.medium;

// import array.easy.linearSearch;

// public class longestSequenceInArray {

//     public static void main(String[] args) {
        
//     int[] nums = {100, 4, 200, 1, 3, 2};

//     int longest = 1;
//         for( int i=0;i<nums.length;i++){
//             int target = nums[i];+
//             int counter =1;

//             while ( linearSearch(nums,target+1) == true) {
                 
//                 counter++;
//                 target++;

                
//             }
//             longest = Math.max(counter, longest);
//         }

//         System.out.println(longest);
//     }

//     private static boolean linearSearch( int[] nums, int target){

//          for( int i=0;i< nums.length; i++){
//             if( nums[i] == target){

//                 return true;
//             }
//          }
//            return false;
//     }
    
// }



// optimal solution :

package array.medium;

import java.util.ArrayList;

import array.easy.linearSearch;
import java.util.*;

public class longestSequenceInArray {

    public static void main(String[] args) {
        
    int[] nums = {100, 4, 200, 1, 3, 2};

    int longest = 1;


    List<Integer> list = new ArrayList<>();

    for( int num : nums){
         list.add(num);
    }

    for( int i=0;i< nums.length;i++){
        int count =1;

        if( !list.contains(nums[i]-1)){

            int current_elem = nums[i];

            while( list.contains( current_elem+1)){

                count++;
                current_elem++;
            }

        }

        longest = Math.max(count,longest);

 
    }
    System.out.println(longest);

     
   
    }
    
}