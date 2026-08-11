// Find minimum in each row. 

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
        for (int i = 0; i < m; i++){
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++){
                if (matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
            System.out.println(min);
        }
    }
}
