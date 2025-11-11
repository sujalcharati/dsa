package hashing;

import java.util.*;

public class frequency {

    public static void main(String[] args) {

        List<List<Integer>> list = new ArrayList<>();
        
        List <Integer> p1 = Arrays.asList(2,3);
        List <Integer> p2 = Arrays.asList(3,4);

        list.add(p2);
        list.add(p1);

        System.out.println(list);
        System.out.println(list.get(1));
        }
    
}

