class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int value = 1;
        while(top <= bottom && left <= right){
            for (int j = left; j <= right; j++){
                matrix[top][j] = value;
                value++;
            }
            top++;
            for (int i = top; i <= bottom; i++){
                matrix[i][right] = value;
                value++;
            }
            right--;
            if (top <= bottom){
                for (int j = right; j >= left; j--){
                    matrix[bottom][j] = value;
                    value++;
                }
                bottom--;
            }
            if (left <= right){
                for (int i = bottom; i >= top; i--){
                    matrix[i][left] = value;
                    value++;
                }
                left++;
            }
        }
        return matrix;
    }
}
