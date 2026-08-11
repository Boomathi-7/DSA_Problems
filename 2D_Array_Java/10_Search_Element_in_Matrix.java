//  Search an element in a matrix.  

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
        int target = scan.nextInt();
        scan.close();
        boolean found = false;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (matrix[i][j] == target){
                    found = true;
                    break;
                }
            }
            if (found){
                break;
            }
        }
        if (found){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
