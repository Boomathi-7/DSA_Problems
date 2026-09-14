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


// Optimal Solution
class Solution {
    private int[][] grid1;
    private int[][] grid2;
    private int m;
    private int n;

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        this.grid1 = grid1;
        this.grid2 = grid2;
        m = grid1.length;
        n = grid1[0].length;

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid2[i][j] == 1) {
                    count += dfs(i, j);
                }
            }
        }

        return count;
    }

    private int dfs(int i, int j) {
        int valid = grid1[i][j];

        grid2[i][j] = 0;

        if (i > 0 && grid2[i - 1][j] == 1) {
            valid &= dfs(i - 1, j);
        }

        if (i + 1 < m && grid2[i + 1][j] == 1) {
            valid &= dfs(i + 1, j);
        }

        if (j > 0 && grid2[i][j - 1] == 1) {
            valid &= dfs(i, j - 1);
        }

        if (j + 1 < n && grid2[i][j + 1] == 1) {
            valid &= dfs(i, j + 1);
        }

        return valid;
    }
}
