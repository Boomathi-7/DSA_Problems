// Find maximum in each column. 

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        scan.close();
        for (int i = 0; i < n; i++){
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++){
                if (matrix[j][i] > max){
                    max = matrix[j][i];
                }
            }
            System.out.println(max);
        }
    }
}
