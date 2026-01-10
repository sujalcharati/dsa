package strings.easy;
import java.util.*;
public class longestCommonPrefix {


    public static String findLongestPrefix( String[] arr){

        Arrays.sort(arr);

        char[] first = arr[0].toCharArray();
        char[] last = arr[arr.length-1].toCharArray();
        StringBuilder sb = new StringBuilder();
        for( int i=0; i< arr[0].length()-1; i++){

            if( first[i] != last[i]){
                break;        
            }
            sb.append(first[i]);

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String val = findLongestPrefix( strs);
        System.out.println(val);
    }
    
}
