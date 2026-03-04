// brute force solution ....






// class StockSpanner {
    
//     ArrayList<Integer> list ;

//     public StockSpanner() {

//         list = new ArrayList<>();
        
//     }
    
//     public int next(int price) {

//         list.add(price);
//         int count = 1;

//         for( int i= list.size()-2; i >=0; i--){

//             if( list.get(i) <= price){
//                 count++;
//             }else{
//                 break;
//             }
//         }
//         return count;
        
//     }
// }

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */




// optimal solution ....




// class StockSpanner {
    
//     Stack<int[]> st;
//     int ind = -1;

//     public StockSpanner() {

//         st = new Stack<>();
//         ind = -1;

        
//     }
    
//     public int next(int price) {

//         ind = ind+1;

//         while( !st.isEmpty() && st.peek()[0] <= price){
//             st.pop();
//         }

//         int ans = ind -( !st.isEmpty()? st.peek()[1] : -1);

//         st.push( new int[]{ price, ind});

//         return ans;
        
//     }
// }

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
