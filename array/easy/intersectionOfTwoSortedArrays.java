package array.easy;

import java.util.ArrayList;

public class intersectionOfTwoSortedArrays {


     static ArrayList<Integer> findIntersection(int[] a,int[] b, int size1, int size2){

        int i =0;
        int j=0;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(i=0;i<a.length;i++){

            for(j=0;j<b.length;j++){
                if( a[i] == b[j]){
                    if( list.size()==0 || list.get(list.size()-1) != a[i]){

                        list.add(a[i]);
                        break;
                    }
                    }
            }
        }

        return list;
     }

    public static void main(String[] args) {
        
        int[] a = {1,2,2,3,3,4,5,6};
        int[] b = {2,3,3,5,6,6,7};

        int size1 = a.length;
        int size2 = b.length;

        ArrayList<Integer> list = findIntersection(a,b,size1,size2);
        System.out.println(list);


    }
    
}
