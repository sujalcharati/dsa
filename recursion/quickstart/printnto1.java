package quickstart;

public class printnto1 {


    static void printnumber( int n){


        if( n < 1){
            return;
        }

        System.out.println(n);
        printnumber(n-1);
    }


    public static void main(String[] args) {
        
        int n = 10;
        printnumber( n);
    }
    
}
