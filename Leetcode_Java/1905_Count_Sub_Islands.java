class Solution {
    public boolean dfs(int[][] grid1, int[][] grid2, int i, int j){
        if (i < 0 || i >= grid1.length || j < 0 || j >= grid1[0].length || grid2[i][j] == 0){
            return true;
        }
        grid2[i][j] = 0;
        boolean valid = true;
        if (grid1[i][j] == 0){
            valid = false;
        }
        boolean up = dfs(grid1, grid2, i-1, j);
        boolean down = dfs(grid1, grid2, i+1, j);
        boolean left = dfs(grid1, grid2, i, j-1);
        boolean right = dfs(grid1, grid2, i, j+1);
        return valid && up && down && left && right;
    }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int m1 = grid1.length;
        int n1 = grid1[0].length;
        int m2 = grid2.length;
        int n2 = grid2[0].length;
        int count = 0;
        for (int i = 0; i < m2; i++){
            for (int j = 0; j < n2; j++){
                if (grid2[i][j] == 1){
                    if (dfs(grid1, grid2, i, j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
