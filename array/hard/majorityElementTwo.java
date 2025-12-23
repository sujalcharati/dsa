// complexity O( n^2 ):

package array.hard;

import java.util.ArrayList;
import java.util.List;

public class majorityElementTwo {

    public static List<Integer> findMajority( int[] arr){

        List<Integer> ans = new ArrayList<>();

        for( int i=0; i< arr.length-1;i++){
            int count =0;
            int val = arr[i];
            if( ans.contains(arr[i])) continue;
            for(int j=0; j< arr.length;j++){
                if( arr[j] == val){
                    count++;
                } 
            }
            if( count > arr.length/3){
                ans.add(arr[i]);
            }

        }
        return ans;
    }


    public static void main(String[] args) {
         int[] arr = {3,2,3,1,1};

         List val = findMajority( arr);
         System.out.println(val);
    }
    
}
