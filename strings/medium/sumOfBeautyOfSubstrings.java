package strings.medium;

public class sumOfBeautyOfSubstrings {

    static int getmin( int[] arr){
        int min =Integer.MAX_VALUE;

        for( int i=0; i< arr.length; i++){

            if( arr[i] !=0){
                min = Math.min(min, arr[i]);
            }
        }
        return min;

    }

    static int getmax( int[] arr){
        int max =0;

        for( int i=0; i< arr.length; i++){

            max = Math.max(max, arr[i]);
        }
        return max;
    }
   

    static int findBeautyOfSubstring(String str){

        int sum =0;

        for( int i=0; i< str.length()-1; i++){

            int[] freq = new int[26];
           
            for( int j=i; j < str.length(); j++){
            
              freq[str.charAt(j)-'a']++;

              int beauty = getmax(freq)-getmin(freq);
              sum +=beauty;

            }
        }

        return sum;
    }

    public static void main(String[] args) {
        
        String s = "aabcbaa";
        int val = findBeautyOfSubstring(s);
        System.out.println(val);
    }
    
}
