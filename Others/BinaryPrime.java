import java.util.*;
class Main {
    public static String isBinaryPrime(int number){
        if (number <= 1){
            return "-1";
        }
        if (number == 2){
            return "Binary Prime";
        }
        if (number % 2 == 0){
            return "-1";
        }
        for (int i = 3; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return "-1";
            }
        }
        return "Binary Prime";
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = Integer.bitCount(num);
        System.out.println(isBinaryPrime(sum));
    }
}
