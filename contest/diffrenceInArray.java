package contest;

import java.util.ArrayList;
import java.util.List;

public class diffrenceInArray {
   
    public static List<List<Integer>> findDifferenceArray( int[] arr1, int[] arr2){

        List<List<Integer>> ans = new ArrayList<>(2);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for( int i=0; i< arr1.length; i++){
            list1.add(arr1[i]);
            list2.add(arr2[i]);
            
        }

        List<Integer> result1 = new ArrayList<>();
        for( int num : list1){
            if( !list2.contains(num)){
                result1.add(num);
            }
        }
        ans.add(result1);

        List<Integer> result2 = new ArrayList<>();
        for( int num : list2){
            if( !list1.contains(num)){
                result2.add(num);
            }
        }
        ans.add(result2);

        return ans;
    }

    public static void main(String[] args) {
        
        int[] arr1 = { 1,2,4};
        int[] arr2 = { 2,3,5};

        List<List<Integer>> ans = findDifferenceArray(arr1, arr2);
        System.out.println(ans);
    }
    
}
