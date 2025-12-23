// brute force with O( n^3):

// package array.hard;

// import java.util.*;

// public class threeSumProblem {

//     public static List<List<Integer>> findThreeSum( int[] arr){

//         List<List<Integer>> ans = new ArrayList<>();
//         Set<List<Integer>> val = new HashSet<>();

//         for( int i=0; i< arr.length; i++){


//             for( int j= i+1; j < arr.length; j++){

//                 for( int k= j+1; k < arr.length;k++){

//                     if( arr[i]+arr[j]+arr[k] == 0){
//                         List<Integer> temp = Arrays.asList( arr[i],arr[j],arr[k]);
//                         Collections.sort(temp);
//                         val.add(temp);
//                     }
//                 }

//             }
//         }
//         ans.addAll(val);
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 2, -2, 0, 3, -3, 5};
//         List ans = findThreeSum(arr);
//         System.out.println(ans);
//     }
// }



// optimal solution with O( n^2):


package array.hard;

import java.util.*;

public class threeSumProblem {

    public static List<List<Integer>> findThreeSum( int[] arr){

        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> sett = new HashSet<>();
        for( int i=0; i< arr.length; i++){
            Set<Integer> val = new HashSet<>();

            for( int j= i+1; j < arr.length; j++){

                int target = -( arr[i]+arr[j]);

                    if( val.contains(target) ){
                        List<Integer> temp = Arrays.asList( arr[i],arr[j],target);
                        Collections.sort(temp);
                        sett.add(temp);
                    }
 
                    val.add(arr[j]);
                }
        }
        ans.addAll(sett);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, -2, 0, 3, -3, 5};
        List<List<Integer>> ans = findThreeSum(arr);
        System.out.println(ans);
    }
}
