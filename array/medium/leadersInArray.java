// brute-force method:


// package array.medium;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.*;

// public class leadersInArray {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 5, 3, 1, 2};
//         List<Integer> list = new ArrayList<>();
//         for( int i=0;i < nums.length;i++){
//             int flag = 1;
//              for( int j=i+1;j< nums.length;j++){
//                 if( nums[i] <= nums[j]){
//                     flag =0;
//                     break;
//                 }
//             }
//             if( flag ==1){

//                 list.add(nums[i]);
//             }
//          }
//         System.out.println(list);
//     }
    
// }




//optimal solution : 

package array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class leadersInArray {

    public List<Integer> findLeader(int[] nums){
        List<Integer> ans = new ArrayList<>();

        int max = nums[nums.length-1];
        ans.add(max);

        for( int i = nums.length-2;i>=0;i--){
            if( nums[i] > max){
                ans.add(nums[i]);
                max = nums[i];
            }
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1, 2};
        leadersInArray obj = new leadersInArray();

        List<Integer> list = obj.findLeader(nums);        
        System.out.println(list);
    }
    
}
