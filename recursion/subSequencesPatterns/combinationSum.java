// class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {

//         List<Integer> ans = new ArrayList<>();
//         List<List<Integer>> result = new ArrayList<>();
//         recursiveCall(0,candidates,target,ans, result );
//         return result;
//     }

//     public void recursiveCall(int index, int[] candidates, int target, List<Integer> ans ,List<List<Integer>> result){

//         if( index == candidates.length){
//             if( target == 0){
//                result.add( new ArrayList<>(ans));
            
//             }
//             return;
//         }
        

//         if( candidates[index] <= target){

//         ans.add(candidates[index]);
//         recursiveCall(index,candidates,target-candidates[index],ans, result);
//         ans.remove(ans.size()-1);
//         }

//         recursiveCall(index+1, candidates, target, ans, result);


//     }
// }