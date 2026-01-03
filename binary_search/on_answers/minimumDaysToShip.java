// brute force method...
public class minimumDaysToShip {

   public static int findMinimumDays( int[] nums, int days){
     
    int min =0;
    int max =0;
    for( int i=0; i< nums.length; i++){
         min = Math.max(nums[i], min);
         max = max+nums[i];
    }

    for( int i= min; i <= max;i++){
        int sum =0;
        int day=1;
        for( int j=0; j< nums.length;j++){
           if( sum+nums[j] <= i){

               sum+=nums[j];
           } else{
               
              sum= nums[j];
              day++;
           }
        }

        if( day <= days){
            return i;
        }
    }
    return -1;
   }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        int val = findMinimumDays(nums, days);
        System.out.println(val);
        
    }
    
}
