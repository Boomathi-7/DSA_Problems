class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        int n = 0;
        for (int i = 0; i < m; i++){
            n = mat[i].length;
        }
        int sum = 0;
        for (int i = 0; i < m; i++){
            sum += mat[i][i];
        }
        for (int i = 0; i < m; i++){
            if (i != n-1-i){
                sum += mat[i][n-1-i];
            }
        }
        return sum;
    }
}
