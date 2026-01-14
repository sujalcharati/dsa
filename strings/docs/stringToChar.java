package strings.docs;

import java.util.Arrays;

public class stringToChar {

    public static void main(String[] args) {
        String s = "sujal";
        char[] ch = s.toCharArray(); // [ s u j a l]
        for( char item : ch){
            System.out.print( item+" ");
        }


        String[] ans = { "sujal", "suchi","sua","suzal"}; // [sua suchi sujal suzal]
        Arrays.sort(ans);

          for( String str : ans){

              System.out.println(str);
          }
    }
    
}
