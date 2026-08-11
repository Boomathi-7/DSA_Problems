// Count even and odd numbers. 

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
        int even = 0;
        int odd = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (matrix[i][j] % 2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
