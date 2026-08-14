// Check whether matrix is identity.

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
        boolean identity = true;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (i != j && matrix[i][j] != 0){
                    identity = false;
                    break;
                }
                if ( i == j && matrix[i][j] != 1){
                    identity = false;
                    break;
                }
            }
            if (!identity){
                break;
            }
        }
        if (identity){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
