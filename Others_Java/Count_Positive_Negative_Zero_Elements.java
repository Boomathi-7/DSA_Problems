import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++){
            numbers[i] = scan.nextInt();
        }
        int positive = 0;
        int zero = 0;
        int negative = 0;
        for (int j = 0; j < n; j++){
            if (numbers[j] == 0){
                zero++;
            }
            else if (numbers[j] > 0){
                positive++;
            }
            else{
                negative++;
            }
        }
        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);
    }
}



// Constraints: Use Functions
// void readArray(int arr[], int n);
// void countElements(int arr[], int n);

import java.util.*;
class Main{
    public static void readArray(int arr[], int n, Scanner scan){
        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
    }
    public static void countElements(int arr[], int n){
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int j = 0; j < n; j++){
            if (arr[j] == 0){
                zero++;
            }
            else if (arr[j] > 0){
                positive++;
            }
            else{
                negative++;
            }
        }
        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zer = " + zero);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];
        readArray(numbers, n, scan);
        countElements(numbers, n);
    }
}
