// brute force method...

// package array.medium;

// public class majorityElementOne {

//     public static void main(String[] args) {
        
//         int[] arr = {-1, -1, -1, -1};
        
//         for(int i=0;i< arr.length;i++){
//             int count =0;
            

//             for(int j=0; j< arr.length;j++){
//                 if( arr[i] == arr[j]){
//                      count++;
//                 }
//             }

                // if ( count >= arr.length/2) return arr[i];

//         }
          
        //    return -1

//     }
    
// }


// better approach with hash map :

package array.medium;

import java.util.HashMap;
import java.util.Map;

public class majorityElementOne {

    public static void main(String[] args) {
        
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i< arr.length;i++){

            int value = map.getOrDefault(arr[i], 0);
            map.put(arr[i], value+1);
           
        }
        System.out.println(map);

        for(Map.Entry<Integer,Integer> val : map.entrySet()){
            if( val.getValue() >= arr.length/2){
                System.out.println(val.getKey());
                return ;
            }
        }

     
    }
    
}