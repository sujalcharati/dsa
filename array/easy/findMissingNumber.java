package array.easy;

public class findMissingNumber {

    public static int findnumber( int[] arr , int N){

          
        for( int i=0; i<=N;i++){
             int flag = 0;
            for( int j=0;j< arr.length;j++){
                if( arr[j] ==i){
                    flag = 1;
                    break;
                }
            }

            if ( flag == 0) return i;
            
         }

         return -1;
 
    }
    

    public static void main(String[] args) {
        int N =5;
        
        int[] arr = { 0, 2, 3, 1, 4};

        int val =findnumber(arr, N);
        System.out.println(val);
     
    
}
}