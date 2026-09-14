class Solution {
    public int DFS(int[][] grid, int i, int j){
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;
        int area = 1;
        area += DFS(grid, i-1, j);
        area += DFS(grid, i+1, j);
        area += DFS(grid, i, j-1);
        area += DFS(grid, i, j+1);
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] == 1){
                    int area = DFS(grid, i, j);
                    if (area > max){
                        max = area;
                    }
                }
            }
        }
        return max;
    }
}
