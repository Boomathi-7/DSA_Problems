// Sum of main diagonal. 

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
            System.out.println("Not a Square Matrix.");
            return;
        }
        int sum = 0;
        for (int i = 0; i < m; i++){
            sum += matrix[i][i];
        }
        System.out.println(sum);
    }
}
