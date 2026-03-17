package quickstart;

public class sumOfFirstNnumbers {

    public static int sum =0;
    static void printsum(int i, int n){
        
        if( i > n){
            System.out.println(sum);
            return;
        }
        sum+=i;
        printsum(i+1, n);


    }


    public static void main(String[] args) {
        
        int n = 10;
        int i = 1;
        printsum(i, n);
    }
    
}
