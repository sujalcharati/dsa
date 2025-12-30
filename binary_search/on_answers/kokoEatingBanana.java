// brute force :

// package binary_search.on_answers;

// public class kokoEatingBanana {

//     public static int findMinimumHours( int[] arr, int h){

//         int max =0;
//         for( int i=0; i< arr.length; i++){
//             max = Math.max(max, arr[i]);
//         }

//         for( int i=0; i< arr.length; i++){

//             for( int k=1; k< max; k++){
//                 int sum =0;

//                 for( int j=0; j< arr.length; j++){
//                     sum += (double )Math.floor(arr[j]/k);

//                 }

//                 if( sum <=h){
//                     return k;
//                 }
//             }
//         }

//         return -1;
//     }

//     public static void main( String[] args){

//         int[] arr = {3,6,7,11};
//         int  h = 8;
//         int val = findMinimumHours( arr, h);
//         System.out.println(val);
//     }
    
    
// }



// optimal approach 

// package binary_search.on_answers;

public class kokoEatingBanana {

    public static int findMinimumHours( int[] arr, int h){

        int max =0;
        for( int i=0; i< arr.length; i++){
            max = Math.max(max, arr[i]);
        }

        int left = 1;
        int right = max;

        while ( left < right) {
           int mid = left+( right-left)/2;
           
           double sum =0;
           for( int k=0;k<arr.length;k++){
              sum+= Math.ceil( arr[k]-mid+1/mid);
           }
           if( sum == h) return mid;
           if( sum < h){
            right = mid-1;
           }else {
            left =mid+1;
           }
        }
        return left;
    }

    public static void main( String[] args){

        int[] arr = {3,6,7,11};
        int  h = 8;
        int val = findMinimumHours( arr, h);
        System.out.println(val);
    }
    
    
}