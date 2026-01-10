package strings.easy;

import java.util.*;

public class isomorphicString {


    public static Boolean isIsomorphicString( String s, String t){

        Map<Character, Character> mapp = new HashMap<>();
        Set<Character> sett = new HashSet<>();

        for( int i=0; i< s.length();i++){

            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

          if(  mapp.containsKey(s1)){

            if( mapp.get(s1) != t1){
                return false;
            }
            }else{
             if( sett.contains(t1)){
                return false;
             }

                mapp.put(s1,t1 );
                sett.add(t1);
            }
            
        }
        return true;

    }

    public static void main(String[] args) {
       String s =  "egg", t = "add";
       Boolean val = isIsomorphicString(s, t);
       System.out.println(val);
    }
    
}
