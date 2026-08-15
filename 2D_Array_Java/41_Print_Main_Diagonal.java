// Print main diagonal.  

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

        // Optimal Method
        for (int i = 0; i < m; i++){
            System.out.println(matrix[i][i]);
        }

        // Usual Method
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (i == j){
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }
}
