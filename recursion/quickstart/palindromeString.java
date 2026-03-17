package quickstart;

public class palindromeString {


    public static boolean isvalidpalindrome(String str, int i, int n){

        if( i >= n){
            return true;
        }


        if( str.charAt(i) != str.charAt(n)){
              return false;
        }
        return isvalidpalindrome(str, i+1, n-1);
    }


    public static void main(String[] args) {
        
        String str = "124521";
        int i=0;
        int n = str.length()-1;

        boolean val = isvalidpalindrome(str,i,n);
        System.out.println(val);
    }
    
}
