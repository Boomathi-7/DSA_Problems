class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int m = img1.length;
        int n = img2.length;
        int max = 0;
        for (int i = -(n-1); i <= n-1; i++){
            for (int j = -(n-1); j <= n-1; j++){
                int overlap = 0;
                for (int r = 0; r < m; r++){
                    for (int c = 0; c < m; c++){
                        if (img1[r][c] == 1){
                            int newRow = r+i;
                            int newColumn = c+j;
                            if (newRow >= 0 && newRow < n && newColumn >= 0 && newColumn < n){
                                if (img2[newRow][newColumn] == 1){
                                    overlap++;
                                }
                            }
                        }
                    }
                }
                if (overlap > max){
                    max = overlap;
                }
            }
        }
        return max;
    }
}
