// Find the average of all elements

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
        int sum = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                sum += matrix[i][j];
            }
        }
        int avg = sum/(m+n);
        System.out.println(avg);
    }
}
