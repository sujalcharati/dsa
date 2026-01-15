package strings.medium;

public class countNumberOfStrings {


    public static void main(String[] args) {
        
        String str  = "abc";
        int n = str.length();
        int count = (n*(n+1)/2);
        System.out.println(count);
    }
    
}
