// Check whether matrix is sparse.

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
        int zero = 0;
        int nonZero = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (matrix[i][j] == 0){
                    zero++;
                }
                else{
                    nonZero++;
                }
            }
        }
        if (zero > nonZero){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
