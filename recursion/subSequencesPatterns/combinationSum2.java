// loop based recursion...



// class Solution {
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
//         Arrays.sort(candidates);
//         List<List<Integer>> result = new ArrayList<>();
//         recursiveCall(0, target, new ArrayList<>(), result,candidates);
//         return result;
//     }

//     public void recursiveCall( int index, int target, List<Integer> ds, List<List<Integer>> result, int[] candidates){

//         if( target == 0){
//             result.add(new ArrayList<>(ds));
//             return;
//         }

//         for( int i=index; i < candidates.length; i++){

//             if( i > index && candidates[i] == candidates[i-1]) continue;
//             if( candidates[i] > target) break;

//             ds.add(candidates[i]);
//             recursiveCall(i+1,target-candidates[i],ds,result,candidates);
//             ds.remove( ds.size()-1);



//         }
        
//     }
// }
