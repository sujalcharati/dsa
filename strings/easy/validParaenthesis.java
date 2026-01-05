package strings.easy;

public class validParaenthesis {

    public static void main(String[] args) {


        String str = "()(()())(())";
        int count=0;
        String ans = "";
        
        for(int i=0; i< str.length(); i++){

            if( str.charAt(i) == ')'){
                count--;
        } 
        if( count !=0){
             ans+= str.charAt(i);
        }
        if( str.charAt(i) == '('){
            count++;
        }

        }
        System.out.print(ans);
        

        
    }
    
}
