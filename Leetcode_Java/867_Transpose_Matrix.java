class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = 0;
        for (int i = 0; i < m; i++){
            n = matrix[i].length;
        }
        int[][] transpose = new int[n][m];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
