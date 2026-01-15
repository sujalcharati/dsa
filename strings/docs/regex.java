package strings.docs;
import java.util.*;
public class regex {

    public static void main(String[] args) {
        
        String str = " hello     world";
        String[] arr = str.split("\\s+");  // multiple space to single space
        String cleaned = str.replaceAll("\\s+", " ");


        System.out.println( Arrays.toString(arr));
        System.out.println(cleaned);
    }
}
