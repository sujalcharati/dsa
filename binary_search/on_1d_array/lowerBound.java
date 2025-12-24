package binary_search.on_1d_array;

public class lowerBound {

    public static void main(String[] args) {
         int[] nums = {3,5,8,15,19}; 
         int target = 3;
          int i;
         for(  i=0;i < nums.length;i++){

            if( nums[i] >= target){
                 break ;
            }
         }

         System.out.println(i);


    }
    
}
