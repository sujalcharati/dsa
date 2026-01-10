package strings.easy;

public class largestOddNumber {

    public static void main(String[] args) {
       String s = "02468";

       StringBuilder sb = new StringBuilder(s);

       for( int i= s.length()-1; i>=0; i--){

        int digit = s.charAt(i)-'0';

        if( digit %2 !=0){
            sb.setLength(i+1);
            System.out.println(sb.toString());
            break;
        }
       }
          System.out.println(" ");       
    }
    
}
