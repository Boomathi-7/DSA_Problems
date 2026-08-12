// Matrix Multiplication.

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m1 = scan.nextInt();
        int n1 = scan.nextInt();
        int[][] matrix1 = new int[m1][n1];
        for (int i = 0; i < m1; i++){
            for (int j = 0; j < n1; j++){
                matrix1[i][j] = scan.nextInt();
            }
        }
        int m2 = scan.nextInt();
        int n2 = scan.nextInt();
        int[][] matrix2 = new int[m2][n2];
        for (int i = 0; i < m2; i++){
            for (int j = 0; j < n2; j++){
                matrix2[i][j] = scan.nextInt();
            }
        }

        if (n1 != m2){
            System.out.println("Matrix Multiplication not possible.");
            return;
        }
        int[][] result = new int[m1][n2];
        for (int i = 0; i < m1; i++){
            for (int j = 0; j < n2; j++){
                int sum = 0;
                for (int k = 0; k < n1; k++){
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }
        for (int i = 0; i < m1; i++){
            for (int j = 0; j < n2; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
