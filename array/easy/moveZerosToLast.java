package array.easy;

import java.util.Arrays;



// brute force method ...

// public class moveZerosToLast {

//     public static void main(String[] args) {
        
//         int[] arr = { 1,0,2,0,4,0,4};
//         int[] temp = new int[arr.length];
        
//         int index = 0;
//         for( int i=0;i< arr.length;i++){


//             if(arr[i] !=0){
//                 temp[index] = arr[i];
//                 index++;
//             }

//         }

//         for(int i=0;i< arr.length;i++){
//             arr[i] = temp[i];
//         }

//         System.out.print( Arrays.toString(arr));
//     }
    
// }


// optimal two pointer approach 


public class moveZerosToLast {
   
    public static void moveZeros(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] ==0){
                j=i;
                break;
            }
        }

        for(int i=j+1;i<arr.length;i++){
            if(arr[i] !=0){

              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              j++;
            }
        }
    }

    public static void main(String[] args) {
        
        int[] arr = { 1,0,2,0,4,0,4};

        moveZeros(arr);
        System.out.print( Arrays.toString(arr));
    }
    
}
