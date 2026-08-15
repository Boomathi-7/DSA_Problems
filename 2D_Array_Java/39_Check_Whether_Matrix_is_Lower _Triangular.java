// Check whether matrix is lower triangular.

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
        if (m != n){
            System.out.println("False");
            return;
        }
        boolean lower = true;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (i < j && matrix[i][j] != 0){
                    lower = false;
                    break;
                }
            }
            if (!lower){
                break;
            }
        }
        if (lower){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
