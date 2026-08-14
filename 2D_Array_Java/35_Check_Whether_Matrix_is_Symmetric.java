// Check whether matrix is symmetric.

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
        boolean symmetric = true;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if (matrix[i][j] != matrix[j][i]){
                    symmetric = false;
                    break;
                }
            }
            if (!symmetric){
                break;
            }
        }
        if (symmetric){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
