package maths;

public class armstrong {

    static boolean isarmstrong(int num){
        
        String digit = String.valueOf(num);
        int noofdigit = digit.length();
        int sum = 0;

        for(int i=0;i<noofdigit; i++){
            int d = digit.charAt(i) - '0';
            sum+= Math.pow(d, noofdigit);
        }
        if(sum == num){

            return true;
        }

        return false;

    }
    public static void main(String[] args) {
        int num = 153;
        System.out.println(isarmstrong(num));
        
    }
    
}
