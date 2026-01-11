package strings.easy;

public class checkRotation {


    public static Boolean isRotated( String s, String goal){

        if( s.equals(goal))return true;
        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i < sb.length();i++){

            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);

            if( sb.toString().equals(goal)){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
       String s = "abcde", goal = "cdeab";
       Boolean val = isRotated(s, goal);
       System.out.println(val);
    }
    
}
