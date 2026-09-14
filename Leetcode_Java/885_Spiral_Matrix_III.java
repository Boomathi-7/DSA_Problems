class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows*cols][2];
        int row = rStart;
        int column = cStart;
        int steps = 1;
        int k = 0;
        result[k][0] = row;
        result[k][1] = column;
        k++;
        while (k < rows*cols){
            for (int i = 0; i < steps; i++){
                column++;
                if (row >= 0 && row < rows && column >= 0 && column < cols){
                    result[k][0] = row;
                    result[k][1] = column;
                    k++;
                }
            }
            for (int j = 0; j < steps; j++){
                row++;
                if (row >= 0 && row < rows && column >= 0 && column < cols){
                    result[k][0] = row;
                    result[k][1] = column;
                    k++;
                }
            }
            steps++;
            for (int m = 0; m < steps; m++){
                column--;
                if (row >= 0 && row < rows && column >= 0 && column < cols){
                    result[k][0] = row;
                    result[k][1] = column;
                    k++;
                }
            }
            for (int n = 0; n < steps; n++){
                row--;
                if (row >= 0 && row < rows && column >= 0 && column < cols){
                    result[k][0] = row;
                    result[k][1] = column;
                    k++;
                }
            }
            steps++;
        }
        return result;
    }
}
