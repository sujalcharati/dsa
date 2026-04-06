

// class Solution {
//     public List<String> findPath(int[][] grid) {
//         //your code goes here

//         int n = grid.length;
//         List<String> ans = new ArrayList<>();
//         int[][] visited = new int[n][n];

//         if(grid[0][0] == 1){

//            solve(ans,0, 0,visited, grid, "", n);
//         }
//         return ans;
//     }

//     public void solve(List<String> ans, int x, int y, int[][] visited, int[][] grid, String path, int n ){

//         if( x == n-1 && y == n-1){
//             ans.add(path);
//             return;
//         }

//         visited[x][y] = 1;

//         if( isSafe(x+1,y,n,grid,visited)){
//             solve(ans, x+1, y, visited, grid, path+"D",n);
//         }

//         if(isSafe(x,y+1,n,grid,visited)){
//              solve(ans, x, y+1, visited, grid, path+"R",n);

//         }

//           if(isSafe(x-1,y,n,grid,visited)){
//              solve(ans, x-1, y, visited, grid, path+"U",n);

//         }

//           if(isSafe(x,y-1,n,grid,visited)){
//              solve(ans, x, y-1, visited, grid, path+"L",n);

//         }

//         visited[x][y] = 0;
//     }

//     public boolean isSafe( int x, int y, int n, int[][] grid, int[][] visited){

//         return ( x>=0 && x<n && y>=0 && y<n && grid[x][y] == 1 && visited[x][y] == 0);
//     }


// }
