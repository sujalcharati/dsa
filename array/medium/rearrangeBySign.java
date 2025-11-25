// brute force method ...

// package array.medium;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class rearrangeBySign {
//     public static void main(String[] args){
//         int[] arr = {2, 4, 5, -1, -3, -4};

//         List<Integer> pos = new ArrayList<>();
//         List<Integer> neg = new ArrayList<>();

//         for(int i=0;i< arr.length;i++){
//             if( arr[i] > 0){
//                 pos.add(arr[i]);
//             } 
//             if( arr[i] < 0){
//                 neg.add(arr[i]);
//             }
//         }

//         for(int i=0;i< pos.size();i++){
//             arr[2*i] = pos.get(i);
//             arr[2*i+1] = neg.get(i);
//         }
        
//         System.out.println(Arrays.toString(arr));


//     }
    
// }
  

// optimal approach :

package array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rearrangeBySign {

    public int[] arrangingElement(int[] arr) {

        int[] result = new int[arr.length];
        int pos =0;
        int neg =1;
        for( int i=0;i< arr.length;i++){
             if( arr[i] <0){
                result[neg] = arr[i];
                neg+=2;
             }else{
                result[pos] = arr[i];
                pos+=2;

             }

        }
        return result;
        
    }
    public static void main(String[] args){
        int[] arr = {2, 4, 5, -1, -3, -4};
        rearrangeBySign obj = new rearrangeBySign();
        int[] value =obj.arrangingElement(arr);
        
        System.out.println(Arrays.toString(value));


    }
    
}