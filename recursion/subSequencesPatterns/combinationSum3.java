
// class Solution {
//     public List<List<Integer>> combinationSum3(int k, int n) {

//         List<List<Integer>> ans = new ArrayList<>();

//         findCombination(1,ans,new ArrayList<>(), k,n);
//         return ans;
        
//     }

//     public void findCombination(int index, List<List<Integer>> ans, List<Integer> ds, int k, int n ){

//         if( n == 0 && ds.size() == k){
//             ans.add(new ArrayList<>(ds));
//             return;
//         }

//         if( n <=0 || ds.size() >k) return;

//         for( int i = index; i <=9; i++){

//             if( i <= n){
//                 ds.add(i);
//                 findCombination(i+1,ans,ds,k,n-i);
//                 ds.remove(ds.size()-1);
//             }else{
//                 break;
//             }
//         }
//     }
// }