
// solution with O(n^3)...

package strings.medium;

public class longestPalindromeSubstring {

    static boolean isPalindrome( String s, int i, int j){

        while( i < j){
            if( s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    static String findLongestPalindrom( String s){

        int maxlen =0;
        int start =0;

        for( int i=0; i< s.length();i++){

            for(int j=i; j< s.length(); j++){

                if(  isPalindrome(s,i,j) && maxlen < j-i+1){
                    maxlen = j-i+1;
                    start = i;
                }
            }
        }
        return s.substring(start, start+maxlen);
    }

    public static void main(String[] args) {
        String s = "babad";
        String val = findLongestPalindrom(s);
        System.out.println(val);
    }
    
}



// solution with 0( n^2):

