// Transpose of matrix. 

import java.util.Scanner;
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
        int[][] result = new int[n][m];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                result[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
