// Reverse every column.  
import java.util.*;
class Main{
    public static  void main(String[] args){
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
        for (int i = 0; i < n; i++){
            int left = 0;
            int right = m-1;
            while (left < right){
                int temp = matrix[left][i];
                matrix[left][i] = matrix[right][i];
                matrix[right][i] = temp;
                left++;
                right--;
            }
        }

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
