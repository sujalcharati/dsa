// class Solution {
//     public List<String> addOperators(String num, int target) {
        
//         List<String> ans = new ArrayList<>();

//         solve( 0, 0,0,"",ans, num, target);
//         return ans;
//     }

//     public void solve( int index,long curr_value, long last_operand, String expression, List<String> ans, String num, int target){
        


//         if( index == num.length()){

//             if( curr_value == target){
//                 ans.add(expression);
//             }
//                 return;
//         }


//         for( int i= index; i < num.length(); i++){


//             if (i > index && num.charAt(index) == '0') break;


//             String part = num.substring(index, i+1);
//             long curr = Long.parseLong(part);

//             if( index == 0){
//                 solve(i+1, curr,curr, part,ans, num, target);
//             } else {

//                 solve( i+1, curr_value+curr, curr,expression+"+"+part,ans, num, target);
//                 solve( i+1, curr_value-curr, -curr, expression+"-"+part, ans, num, target);
//                 solve( i+1, curr_value-last_operand+last_operand*curr, last_operand*curr, expression+"*"+part, ans, num, target);

                

//             }
//         }
//     }
// }
