class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] rowZero = new boolean[m];
        boolean[] columnZero = new boolean[n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (matrix[i][j] == 0){
                    rowZero[i] = true;
                    columnZero[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (rowZero[i] || columnZero[j]){
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.print(Arrays.deepToString(matrix));
    }
}
