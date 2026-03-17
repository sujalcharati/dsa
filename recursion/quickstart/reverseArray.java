package quickstart;

public class reverseArray {

    

    public static int[] printreversearray( int l, int r, int[] arr){
        

        if( l >=r ){
            return arr;
        }

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        printreversearray(l+1, r-1, arr);
        return arr;
    }


    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        int l =0;
        int r = arr.length-1;

        int[] val = printreversearray(l, r, arr);
        System.out.println(java.util.Arrays.toString(val));
    }
    
}
