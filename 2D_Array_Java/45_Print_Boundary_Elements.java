// Print boundary elements.

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
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (i == 0 || i == m-1 || j == 0 || j == n-1){
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
