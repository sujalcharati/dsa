package array.easy;


 class solution {
    public int removeduplicate(int[] arr){
        int i =0;
        for (int j=1; j< arr.length;j++){

            if( arr[j] != arr[i]){
                i++;
                arr[i]= arr[j];
            }

        }
        return i+1;
    }

    
}
public class removeDuplicateFromSortedArray {

    public static void main(String[] args) {
         
        int[] arr = { 1,3, 3, 5, 6,7,7 };
        solution sol = new solution();
        int k = sol.removeduplicate(arr);

        System.out.println(" unique count :"+k);
        for( int i=0;i<k;i++){
            System.out.print(arr[i]);
        }

        
    }
    
}
