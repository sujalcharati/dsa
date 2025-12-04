package binary_search;

public class upperBound {

    public static void main(String[] args) {
        
        int[] nums = { 1,2,2,3};
        int target = 2;
        int i;
        for( i=0;i< nums.length;i++){
            if( nums[i] > target){
                break;
            }
        }

        System.out.println(i);
    }
    
}
