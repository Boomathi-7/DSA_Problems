import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (isPrime(num)){
            System.out.println(num + " is prime");
        }
        else{
            System.out.println(num + " is not prime");
        }
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
        for (int i = 3; i <= Math.sqrt(n); i += 2){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
