// package array.easy;

// public class secondLargestElement {

//     public static void main(String[] args) {
//         int[] arr = { 12, 23, 45, 43, 11};
        
//         int maxi = Integer.MIN_VALUE;
//         int second_maxi = Integer.MIN_VALUE;
//         for(int i=0;i< arr.length;i++){
//           maxi = Math.max(arr[i], maxi);
//         }

//         for(int i=0;i< arr.length;i++){
//             if(arr[i]> second_maxi && arr[i]!= maxi){
//                 second_maxi= arr[i];
//             }
//         }

//         System.out.println( "lageest elem\t" + maxi);
//         System.out.println(" second maxi\t"+second_maxi);
//     }
    
// }



// better approach 


package array.easy;

public class secondLargestElement {

    public static void main(String[] args) {
        int[] arr = { 12, 23, 45, 43, 11};
        
        int maxi = Integer.MIN_VALUE;
        int second_maxi = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]> maxi){
                second_maxi = maxi;
                maxi = arr[i];
            } else if( arr[i]> second_maxi && arr[i]!= maxi ){
                second_maxi = arr[i];

            }
        }

        System.out.println( "lageest elem\t" + maxi);
        System.out.println(" second maxi\t"+second_maxi);
    }
    
}