package strings.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class isAnagram {

    public static Boolean checkAnagram( String s, String t){

        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();

        Arrays.sort(sch);
        Arrays.sort(tch);

        if( Arrays.equals(sch, tch)) return true;

        return false;
    }


    public static void main(String[] args) {
        
        String s = "anagram", t = "nagiram";
        Boolean val = checkAnagram(s,t);
        System.out.println(val);
    }

    
}
