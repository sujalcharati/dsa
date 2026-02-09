// public class trapRainWater {
    
// }

class Solution {
    public int trap(int[] height) {

        int n = height.length;

        if( n ==0) return 0;
        int[] prefixsum = new int[n];
        int[] suffixsum = new int[n];

        prefixsum[0] = height[0];

        for( int i=1; i< n; i++){
            prefixsum[i] = Math.max( prefixsum[i-1],height[i]);
        }

        suffixsum[n-1] = height[n-1];

        for( int i= n-2; i>=0; i--){
            suffixsum[i] = Math.max( height[i],suffixsum[i+1]);
        }

        int total =0;

        for( int i=0; i< n; i++){
            total+= Math.min(prefixsum[i], suffixsum[i])-height[i];
        }

        return total;
        
    }
}