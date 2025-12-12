// first approach ...

// package array.medium;

// public class countsubarrayswithsumk {

//     public static void main(String[] args) {
        
//         int[] nums = {1,0,3,4};
//         int k= 4;
//         int count =0;
        
//         for(int i=0; i< nums.length-1;i++){
//             int sum = nums[i];
//             for( int j=i+1;j< nums.length;j++){
//                 sum = sum+nums[j];
//                 if( sum == k){
//                     count++;
//                     continue;
//                 } else if( sum < k) continue;
//                 else break;
//             }
//         }

//         if( nums[nums.length-1] ==k) count++;

//         System.out.println(count);
//     }
    
// }



// second approach ...

package array.medium;

public class countsubarrayswithsumk {

    public static void main(String[] args) {
        
        int[] nums = {1,0,3,4};
        int k= 4;
        int count =0;
        
        for(int i=0; i< nums.length;i++){
            int sum = 0;
            for( int j=i;j< nums.length;j++){
                sum = sum+nums[j];
                if( sum == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}