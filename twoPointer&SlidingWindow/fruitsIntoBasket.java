// brute force :


// class Solution {
//     public int totalFruits(int[] fruits) {
//         //your code goes here

//     int n = fruits.length;
//     int maxfruits = 0;
//     for( int i=0; i < n; i++){
       
//        int count =0;

//          HashMap<Integer, Integer> bucket = new HashMap<>();

//         for( int j=i; j < n; j++){
           
//             bucket.put(fruits[j], bucket.getOrDefault(fruits[j],0)+1);

//             if( bucket.size() > 2){
//                 break;
//             }

//             count++;

//         }
//         maxfruits = Math.max( maxfruits, count);
//     }

//     return maxfruits;
        
//     }
// }



// better solution ...

// class Solution {
//     public int totalFruits(int[] fruits) {
//         //your code goes here
//         int n = fruits.length;
//         int l = 0;
//         int maxcount = 0;
//         HashMap<Integer, Integer> mapp = new HashMap<>();
//         for( int r=0; r < n; r++){
         
//          mapp.put(fruits[r], mapp.getOrDefault(fruits[r], 0)+1);
//             while( mapp.size() >2 ){
//                 mapp.put(fruits[l], mapp.get(fruits[l]-1));

//                 if( mapp.get(fruits[l]) == 0){
//                     mapp.remove(fruits[l]);
//                 }
//                 l++;
//             }

//             maxcount = Math.max(maxcount, r-l+1);

//         }

//         return maxcount;
//     }
// }


// optimal solution...
