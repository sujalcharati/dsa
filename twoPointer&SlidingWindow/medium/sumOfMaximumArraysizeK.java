package medium;
// brute force method ...


class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = { -1,2,2,4,3,2,6,7,4};
        int k=4;
        int max_sum = 0;
        for( int i=0; i<= arr.length-k; i++){
        int sum =0;
            
            for( int j=i; j < i+k; j++){
                sum = sum+arr[j];
            }
            max_sum = Math.max(sum, max_sum);
            System.out.println(max_sum);
            
        }
        
        System.out.println("the max sum is:"+max_sum);
        
    }
}



