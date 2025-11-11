package array;

public class basics {

    public static int main(String[] args) {

        int[] arr = {1,1,2,3};
        int target =1;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
      
    }
    
}
