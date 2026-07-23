import java.util.*;
class Main{
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }
        if (n == 2){
            return true;
        }
        if (n % 2 == 0){
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void reduceToPrime(int n){
        Set<Integer> seen = new HashSet<>();
        int current = n;
        while(true){
            if (isPrime(current)){
                System.out.println(current);
                return;
            }
            seen.add(current);
            int nextSum = sumOfDigits(current);
            if (seen.contains(nextSum)){
                System.out.println(nextSum);
                System.out.println("NOT POSSIBLE");
                return;
            }
            current = nextSum;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        reduceToPrime(n);
    }
}
