// sorted in  non decreasing order...

// package array.easy;

// public class isArraySorted {

//     public static void main(String[] args) {
        
//         int[] arr = { 1, 4 , 5 , 6 ,7};
//         for(int i=0;i<arr.length;i++){

//             if( arr[i] > arr[i+1] ){
//                 System.out.println(" Unsorted");
//                 return;
//             } 
//         } 
//         System.out.println(" sorted!");


//     }
    
// }



// sorted in descending order ...
package array.easy;

public class isArraySorted {

    public static void main(String[] args) {
        
        int[] arr = { 9,8,7,5,1};
        boolean ascending = true;
        boolean descending = true;

        for(int i=0;i< arr.length-1;i++){

            if( arr[i] < arr[i+1]){
                descending = false;
            } else if( arr[i] > arr[i+1]){
                ascending = false;
            }
        }

        if( ascending){
            System.out.println("sorted in ascending order");
        } else if(descending){
            System.out.println("sorted in descending order");
        } else {
            System.out.println("unsorted");
        }



    }
    
}

