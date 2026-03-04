// Online Java Compiler
// Use this editor to write, compile and run your Java code online



// brute force solution...

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr = { 2,5,1,7,10};
        int n = arr.length;
        int k = 14;
        int max_len = 0;
        for( int i=0; i< n; i++){
            int sum =0;
            int len =0;
            for( int j=i; j< n; j++){
                len++;
                sum+=arr[j];
                
                if( sum <= k){
                    max_len = Math.max(max_len, len);
                } else if( sum >k){
                    break;
                }
                
            }
        }
        System.out.println(" the max. length of the subarray is "+max_len);
    }
}

// better solution with O(2N):

class Solution {
    public int subarraySum(int[] nums, int k) {


        int r =0;
        int l =0;
        int n = nums.length;
        int max_len =0;
        int sum =0;
        while( r < n){
            sum = sum+nums[r];

            while( sum > k){
                sum = sum-nums[l];
                l++;
            }


            if( sum <=k){
                max_len = Math.max( max_len, r-l+1);

            }
            r++;

        }
        return max_len;
    }
}

// optimal solution ...




