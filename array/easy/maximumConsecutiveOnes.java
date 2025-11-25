package array.easy;

public class maximumConsecutiveOnes {

    public static void main(String[] args) {
        
        int[] arr = { 1,1,0,1,0,1,1};

        int current_count=0;
        int max_count= 0;

        for( int j=0;j< arr.length;j++){

            if( arr[j]==1){
                current_count++;
                max_count = Math.max(max_count, current_count);
            } else {
                current_count =0;

            }

        }

        System.out.println(max_count);
    }
    
}
