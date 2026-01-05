package strings.easy;

public class reverseString {


    public static String findReverseString( String str){

        str.trim();
        String[] splitted = str.split("\\s+");
        System.out.println(splitted.toString());

        StringBuilder ans = new StringBuilder();

        for( int i=splitted.length-1; i>=0; i--){
             ans.append(splitted[i]);

             if( i != 0){
                     ans.append(" ");
             }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String str = " the pen";
        String val = findReverseString(str);
        System.out.print(val);
    }
    
}
