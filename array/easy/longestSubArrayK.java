
// brute force method i.e., where the time compl. is n^3 

// package array.easy;

// public class longestSubArrayK {

//     public static void main(String[] args) {
        
//         int[] arr = { 10,5,2,7,1,9};
//         int k = 15;
//         int longest =0;  
//         for(int i=0;i<arr.length;i++){
            
//             for(int j=i;j< arr.length;j++){
//                 int sum =0;

//                 for( int l=i; l<= j;l++){
//                     sum+= arr[l];

                    
//                 }

//                 if( sum == k){

//                   longest = Math.max(j-i+1, longest);
    
//                 }
//             }


//         }
//         System.out.print(longest);

//     }
    
// }






// lets consider with this approach  having time comple. n^2:

package array.easy;

public class longestSubArrayK {

    public static void main(String[] args) {
        
        int[] arr = { 10,5,2,7,1,9};
        int k = 15;
        int longest =0;  
        for(int i=0;i<arr.length;i++){
            
            int sum =0;
            for(int j=i;j< arr.length;j++){
                sum+= arr[j];

                if( sum == k){

                  longest = Math.max(j-i+1, longest);
    
                }
            }


        }
        System.out.print(longest);

    }
    
}
