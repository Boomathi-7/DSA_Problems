// Matrix addition.

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[m][n];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix1[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                matrix2[i][j] = scan.nextInt();
            }
        }
        scan.close();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                int sum = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
