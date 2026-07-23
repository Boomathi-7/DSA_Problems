import java.util.*;
class Main{
    public static void readArray(int arr[], int n, Scanner scan){
        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
    }
    public static int secondLargest(int arr[], int n){
        Arrays.sort(arr);
        return arr[n-2];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        readArray(nums, n, scan);
        System.out.println(secondLargest(nums, n));
    }
}

// Another Method
import java.util.*;
class Main{
    public static void readArray(int arr[], int n, Scanner scan){
        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
    } 
    public static int secondLargest(int arr[], int n){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        for (int j = 0; j < n; j++){
            if (arr[j] > largest){
                second = largest;
                largest = arr[j];
            }
            else if (arr[j] > second){
                second = arr[j];
            }
        }
        return second;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        readArray(nums, n, scan);
        System.out.println(secondLargest(nums, n));
    }
}
