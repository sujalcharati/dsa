// class Solution {
//     public List<List<Integer>> powerSet(int[] nums) {
//         //your code goes here
//         List<List<Integer>> result = new ArrayList<>();
//         backtrack(0,new ArrayList<>(), nums, result);
//         return result;
//     }

//     public void backtrack( int index, List<Integer> current, int[] nums, List<List<Integer>> result){

//         result.add(new ArrayList<>(current));
        

//         for( int i=index; i < nums.length; i++){

//             current.add(nums[i]);

//            backtrack(i+1,current,nums,result);

//            current.remove(current.size()-1);


//         }

//     }
// }