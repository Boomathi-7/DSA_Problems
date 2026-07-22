import java.util.*;
class Main{
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
    public static int nearestPrime(int n){
        if (isPrime(n)){
            return n;
        }
        int distance = 1;
        while(true){
            if (isPrime(n-distance)){
                return n-distance;
            }
            if (isPrime(n+distance)){
                return n+distance;
            }
            distance++;
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(nearestPrime(num));
    }
}
