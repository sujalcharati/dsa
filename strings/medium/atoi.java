// some syntax refer like Character.isDigit()
// package strings.medium;

// public class atoi {


//     public static void main(String[] args) {
        
//         String s = "+324a";
//         int i=0;
//         int res =0;
//         while(i < s.length() && Character.isDigit(s.charAt(i))){

//             int val = s.charAt(i)- '0';
//             res = res*10+val;
//             i++;
//         }
//         System.out.println(res);
//     }
    
// }

// problem atoi from string to integer

package strings.medium;

public class atoi {

    static int findAtoi(String s){

        s= s.trim();
        if(s.length()==0) return 0;

        int sign =1;
        int res =0;
        int i =0;


            if( s.charAt(i) == '-'){
                sign = -1;
                i++;
            } else if( s.charAt(i) == '+'){
                sign = 1;
                i++;
            }

        while( i < s.length() && Character.isDigit(s.charAt(i))){

            int val = s.charAt(i)-'0';

            
            if( res > Integer.MAX_VALUE || (res == Integer.MAX_VALUE && val > 7)){
                return (res > 0)? Integer.MAX_VALUE: Integer.MIN_VALUE;
            }
            res= res*10+val;
            i++;
        }

        return res*sign;
    }

    public static void main(String[] args) {
        
     String s = "4193 with words";
     int val = findAtoi(s);
     System.out.println(val);
    }
    
}
