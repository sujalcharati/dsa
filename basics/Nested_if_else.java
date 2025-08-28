package basics;

import java.util.*;
public class Nested_if_else {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the mark and check grade ");
        int marks = sc.nextInt();
        
        if( marks >= 90){
            System.out.println(" grade A");
        } else if (marks >= 70) {
            System.out.println(" grade B");
        } else if ( marks >= 50){
                System.out.println(" grade C");
        } else if ( marks >= 35){
            System.out.println(" grade D");

        } else {
            System.out.println(" fail");
        }
       }
    
}
