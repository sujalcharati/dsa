package quickstart;

public class factorial {


    public static int printfactorial( int n){

        if( n == 1){

            return 1;

        }
        int val = n*printfactorial(n-1);

        return val;
    }


    public static void main(String[] args) {
        
        int n = 5;
        int val = printfactorial(n);
        System.out.println(val);
    }
    
}
