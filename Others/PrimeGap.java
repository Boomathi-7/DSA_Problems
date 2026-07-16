import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int smaller = Math.min(a, b);
        int larger = Math.max(a, b);
        int count = 0;
        for (int i = smaller+1; i < larger; i++){
            if (isPrime(i)){
                count++;
            }
        }
        System.out.println(count);
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
}
