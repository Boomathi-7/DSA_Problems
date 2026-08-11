// Largest row sum.

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
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++){
            int sum = 0;
            for (int j = 0; j < n; j++){
                sum += matrix[i][j];
            }
            if (sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
