package quickstart;

public class print1ton {


    public static void printfunc( int i, int n){
             

        if( i>n){
            return;
        }

        System.out.println(i);
        printfunc(i+1, n);


    }


    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        printfunc(i, n);
    }
    
}
