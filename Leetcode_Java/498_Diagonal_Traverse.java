class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int k = 0;
        for (int i = 0; i <= m+n-2; i++){
            int row = 0;
            int column = 0;
            if (i % 2 == 0){
                if (i < m){
                    row = i;
                    column = 0;
                }
                else{
                    row = m - 1;
                    column = i - m + 1;
                }
            }
            else{
                if (i < n){
                    row = 0;
                    column = i;
                }
                else{
                    row = i - n + 1;
                    column = n - 1;
                }
            }
            while (row >= 0 && row < m && column >= 0 && column < n){
                result[k] = mat[row][column];
                k++;
                if (i % 2 == 0){
                    row--;
                    column++;
                }
                else{
                    row++;
                    column--;
                }
            }
        }
        return result;
    }
}
