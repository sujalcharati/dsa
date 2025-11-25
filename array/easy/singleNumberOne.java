package array.easy;

public class singleNumberOne {

    public static void main(String[] args){

        int[] arr = {1,2,2,4,3,1,4};

        for( int i =0;i< arr.length;i++){
            int count =0;
           for( int j=0; j< arr.length;j++){
               if( arr[j] == arr[i]){
                count++;
               }
           }

           if ( count == 1) {
            System.out.print(" required answer is :" + +arr[i]);
             break;
        }

    }
}
}


