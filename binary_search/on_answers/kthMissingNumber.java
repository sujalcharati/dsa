public class kthMissingNumber {

    public static void main(String[] args) {
        
        int[]  arr = {3, 5, 7, 10};
        int k = 6;


        for(int i=0;i< arr.length; i++){

            if( arr[i] <= k){
                k++;
            } else{
                break;
            }
        }
        System.out.println(k);
    }
    
}
