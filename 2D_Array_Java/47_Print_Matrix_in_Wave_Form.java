// Print matrix in wave form.

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
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                for (int j = 0; j < m; j++){
                    System.out.print(matrix[j][i] + " ");
                }
            }
            else{
                for (int j = m-1; j >= 0; j--){
                    System.out.print(matrix[j][i] + " ");
                }
            }
        }
    }
}
