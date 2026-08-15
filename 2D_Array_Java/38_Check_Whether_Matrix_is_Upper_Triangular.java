// Check whether matrix is upper triangular.

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
        boolean upper = true;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (i > j && matrix[i][j] != 0){
                    upper = false;
                    break;
                }
            }
            if (!upper){
                break;
            }
        }
        if (upper){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
