import java.util.Scanner;
class Main{
    public static void readArray(int arr[], int n, Scanner scan){
        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
    }
    public static String isStrictlyIncreasing(int arr[], int n){
        for (int i = 1; i < n; i++){
            if (arr[i] <= arr[i-1]){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        readArray(nums, n, scan);
        System.out.println(isStrictlyIncreasing(nums, n));
    }
}
