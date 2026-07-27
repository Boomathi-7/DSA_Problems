import java.util.Scanner;
class Main{
    public static void readArray(int arr[], int n, Scanner scan){
        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
    }
    public static float findAverage(int arr[], int n){
        int sum = 0;
        for (int j = 0; j < n; j++){
            sum += arr[j];
        }
        float avg = (float) sum/n;
        return avg;
    }
    public static int countEvenGreaterThanAverage(int arr[], int n, float avg){
        int count = 0;
        for (int m = 0; m < n; m++){
            if (arr[m] > avg && arr[m] % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        readArray(nums, n, scan);
        float avg = findAverage(nums, n);
        System.out.println(countEvenGreaterThanAverage(nums, n, avg));
    }
}
