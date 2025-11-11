package array.easy;

public class largestElement {

    public static void main( String[] args){

        int[] arr = { 234, 4, 5, 67, 34};

        int max = arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println("The max element over here is "+max);
    }
    
}
