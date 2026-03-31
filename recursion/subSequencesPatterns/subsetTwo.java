

// class Solution {
//     public List<List<Integer>> subsetsWithDup(int[] nums) {
        
//         Arrays.sort(nums);
//         List<List<Integer>> answer = new ArrayList<>();
//         printSubset(0,answer, new ArrayList<>(),nums);
//         return answer;
//     }

//     public void printSubset(int index, List<List<Integer>> answer, List<Integer> ds, int[] nums){

//         answer.add( new ArrayList<>(ds));
   
//         for( int i=index; i< nums.length; i++){
        
//         if ( i > index && nums[i] == nums[i-1]) continue;

//         ds.add(nums[i]);
//         printSubset(i+1, answer, ds,nums);
//         ds.remove(ds.size()-1);

//         }

//     }
// }
