package strings.docs;

public class characterInsights {

    public static void main(String[] args) {


    //----when char is digit and you want to make it to a number just subtract that char with '0'---------



    //     int res =0;
    //     String s = "123";
    //     for( int i=0; i< s.length(); i++){

    //         int val = s.charAt(i)-'0';

    //         res = res*10+val;
    //     }

    //     System.out.println(res);
    // }



    //----when char is alphabet  and you want to make it to a array based index number just subtract that char with 'a'---------

      String s = "abc";
        for( int i=0; i< s.length(); i++){

            int val = s.charAt(i)-'a';
            System.out.println(val);
        }
        
    }
    
}
