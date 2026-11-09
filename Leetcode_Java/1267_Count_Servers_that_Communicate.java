class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] rowCount = new int[m];
        int[] columnCount = new int[n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] == 1){
                    rowCount[i]++;
                    columnCount[j]++;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] == 1){
                    if (rowCount[i] > 1 || columnCount[j] > 1){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
