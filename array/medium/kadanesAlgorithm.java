// brute-force method : //

// package array.medium;

// public class kadanesAlgorithm {

//     public static void main(String[] args) {
//         int[] arr = {-1, 2, 3, -1, 2, -6, 5};
//         int longest =arr[0];
//         for( int i=0;i< arr.length;i++){
//             int sum =0;
//             for( int j=0;j<arr.length;j++){
//                 sum+=arr[j];
//                  longest = Math.max(sum, longest);

//             }
//         }
//         System.out.println(longest);

//     }
    
// }


// better method : 


package array.medium;

public class kadanesAlgorithm {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, -2, 7, -4};
        int maximum= Integer.MIN_VALUE;
        int sum =0;
        for( int i=0;i< arr.length;i++){
            sum+=arr[i];

            if (sum > maximum) {
                maximum= sum;
            }

            if(sum <0){
                sum =0;
            }
            
        }
        System.out.println(maximum);

    }
    
}