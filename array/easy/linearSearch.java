package array.easy;

public class linearSearch {

    public static void main(String[] args) {
        
        int[] arr = { 1,3,5,4,9};
        int target = 6;
        boolean found = false;

        for(int i=0;i< arr.length;i++){
            if( arr[i] == target){
                found= true;
                System.out.println(i);
                break;
            }            
        }
        if(!found){
            System.out.println(-1);
        }
    }
    
}
