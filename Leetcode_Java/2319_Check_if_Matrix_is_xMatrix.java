class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        boolean xMatrix = true;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i == j || i+j == n-1){
                    if (grid[i][j] == 0){
                        xMatrix = false;
                        break;
                    }
                }
                else{
                    if (grid[i][j] != 0){
                        xMatrix = false;
                        break;
                    }
                }
            }
            if (!xMatrix){
                break;
            }
        }
        return xMatrix;
    }
}
