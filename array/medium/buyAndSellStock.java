// brute force method ...

// package array.medium;

// public class buyAndSellStock {

//     public static void main(String[] args){
//         int[] arr = {10, 7, 5, 8, 11, 9};

//         int max_profit =0;
        
//         for(int i=0;i< arr.length;i++){
//             int buy = arr[i];
//             for(int j=i;j< arr.length;j++){
//                 int sell = arr[j];
//                 int profit = sell -buy;

//                 max_profit = Math.max(max_profit, profit);
//             }
//         }
//         System.out.print(max_profit);
//     }
    
// }


// optimal solutions :
 package array.medium;

public class buyAndSellStock {

    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};

        int max_profit =0;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i< arr.length;i++){
            if(min >arr[i]){
                min = arr[i];

            }
            int profit = arr[i]-min;
            max_profit = Math.max(max_profit, profit);
          
        }
        System.out.print(max_profit);
    }
    
}
