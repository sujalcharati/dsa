package strings.docs;

import java.util.Arrays;

public class output {


    public static void main(String[] args) {
        
        // so in println() method there is under the hood we have toString() method which helps in printing in string in console...
        
        System.out.println(56); // 56
        System.out.println("sujal"); // sujal
        System.out.println( new int[]{ 1,2,3,4}); // I@7ad041f3
        System.out.println( Arrays.toString(new int[]{1,2,3,4})); // [ 1,2,3,4]
    }
    
}
