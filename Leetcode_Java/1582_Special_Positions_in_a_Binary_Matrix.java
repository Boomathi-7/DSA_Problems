class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (mat[i][j] == 1){
                    boolean isSpecial = true;
                    for (int r = 0; r < m; r++){
                        if (r != i && mat[r][j] == 1){
                            isSpecial = false;
                        }
                    }
                    for (int c = 0; c < n; c++){
                        if (c != j && mat[i][c] == 1){
                            isSpecial = false;
                        }
                    }
                    if (isSpecial){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
