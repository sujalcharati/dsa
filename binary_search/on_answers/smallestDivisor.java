// brute force method ....


// public class smallestDivisor {


//     public static int findSmallestDivisor( int[] nums, int threshold){

//         int max = Integer.MIN_VALUE;
//         int divisor = Integer.MAX_VALUE;

//         for( int i=0; i< nums.length;i++){
//             max = Math.max(max,nums[i]);
//         }

//         for( int d=1;d <= max; d++){
//             int sum =0;

//             for( int i=0; i< nums.length;i++){
//                 sum+= (nums[i]+d-1)/d;

//             }

//             if( sum <= threshold){
//                 divisor = d;
//                 break;
//             }
//         }

//         return divisor;
//     }


//     public static void main(String[] args) {
        
//         int[] nums = {1,2,5,9};
//         int threshold = 6;

//         int val = findSmallestDivisor(nums,threshold);
//         System.out.println(val);
//     }
    
// }



// optimal search ...


public class smallestDivisor {


    public static int findSmallestDivisor( int[] nums, int threshold){

        int max = Integer.MIN_VALUE;

        for( int i=0; i< nums.length;i++){
            max = Math.max(max,nums[i]);
        }

        int low =1;
        int high = max;
        int ans =0;

        while ( low <=high) {

            int mid = low+(high-low)/2;
            int sum =0;

            for( int i=0;i <nums.length;i++){
                sum+= (nums[i]+mid-1)/mid;
            }
            if( sum <= threshold){
                ans =mid;
                high= mid-1;
            }else {
                low= mid+1;
            }
        }

       
          

        return ans;
    }


    public static void main(String[] args) {
        
        int[] nums = {1,2,5,9};
        int threshold = 6;

        int val = findSmallestDivisor(nums,threshold);
        System.out.println(val);
    }
    
}
