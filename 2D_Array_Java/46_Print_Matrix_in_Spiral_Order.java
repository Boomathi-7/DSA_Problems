// Print matrix in spiral order.  

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
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;

        while(top <= bottom && left <= right){
            for (int j = left; j <= right; j++){
                System.out.print(matrix[top][j] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++){
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= bottom){
                for (int j = right; j >= left; j--){
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--;
            }

            if (left <= right){
                for (int i = bottom; i >= top; i--){
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
