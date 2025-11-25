package array.easy;

import java.util.ArrayList;

public class uniounOfTwoSortedArrays {

    static ArrayList< Integer> findUnioun(int[] arr1, int[] arr2, int size1, int size2){

        int i=0,j=0;
        ArrayList<Integer> union = new ArrayList<>();
        while ( i < size1 && j < size2) {
            
            if( arr1[i] <= arr2[j]){
                if(union.size() ==0 || union.get(union.size()-1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            } else {
                 if( union.size()==0 || union.get(union.size()-1) != arr2[j]){
                    union.add(arr2[j]);
                 }
                 j++;
            }


        }

        while( i < size1){

            if( union.size() == 0 || union.get(union.size()-1) != arr1[i]){

                union.add(arr1[i]);
            }
            i++;
        }


        while( j < size2){

            if( union.size() == 0 || union.get(union.size()-1) != arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }

        return union;

    }

    public static void main(String[] args) {
        
        int[] arr1 = {3, 4, 6, 7, 9, 9};
        int[] arr2= {1, 5, 7, 8, 8};
        int size1 = arr1.length;
        int size2 = arr2.length;

        ArrayList<Integer> list = findUnioun(arr1,arr2,size1,size2);

        for( int val :list){
                 System.out.println(val);
        }
    }
    
}
