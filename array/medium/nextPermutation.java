package array.medium;
import java.util.*;

public class nextPermutation {

    public List<Integer> findNextPermutation( int[] arr, int n){

        int index =-1;
        for(int i=n-2;i>=0;i--){
            if( arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }

        if( index == -1){
             reverse(arr,0,n-1);
           
        }else{

        for(int i=n-1;i >index;i--){
            if( arr[i] > arr[index]){
              int temp = arr[index];
              arr[index] = arr[i];
              arr[i]= temp;
              break;
            }
        }

        reverse(arr, index+1, n-1);
    }


        List<Integer> list = new ArrayList<>();
        for(int num: arr ) list.add(num);




        return list;

    }

    private void reverse(int[] arr, int start, int end){
        while( start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        
        int[] arr= { 2,1,5,4,3,0,0};

        int n = arr.length;

        nextPermutation obj = new nextPermutation();
        List<Integer> list = obj.findNextPermutation(arr,n);
        System.out.println(list);




    }
    
}
