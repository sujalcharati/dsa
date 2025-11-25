
// better approach 

// package array.medium;

// import java.util.Arrays;

// public class sortOneTwoZero {


//     public static void sortElements( int[] nums){

//         int ctn0 =0;
//         int ctn1 =0;
//         int ctn2 =0;
         
//         for(int i=0;i<nums.length;i++){
//             if( nums[i] ==0 ) ctn0++;
//             else if(nums[i] ==1) ctn1++;
//             else ctn2++;
//         }

//         for(int i=0; i< ctn0;i++){
//             nums[i] =0;
//         }
//         for(int i=ctn0;i < ctn0+ctn1;i++){
//             nums[i] = 1;
//         }
//         for(int i= ctn1+ctn0;i < ctn0+ctn1+ctn2;i++){
//             nums[i] = 2;
//         }

         

//     }
//     public static void main(String[] args) {
//          int[] nums = { 1,0,2,1,0};
//          sortElements(nums);
//          System.out.println(Arrays.toString(nums));

    


//     }
    
// }



// optimal approach :

package array.medium;

import java.util.Arrays;

public class sortOneTwoZero {


    public static void sortElements( int[] nums){

        int low =0;
        int mid =0;
        int high =nums.length-1;
         
        while( mid <= high){

            if( nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low]= temp;
                low++;
                mid++;

            }
            else if ( nums[mid] ==1){
                 mid++;
            } else {
                int temp = nums[mid];
                nums[mid]= nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
         int[] nums = { 1,0,2,1,0};
         sortElements(nums);
         System.out.println(Arrays.toString(nums));

    


    }
    
}


