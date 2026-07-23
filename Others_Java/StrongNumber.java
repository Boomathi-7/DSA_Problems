import java.util.*;
public class Main{
    public static int getFactorial(int digit){
        int fact = 1;
        for (int i = 1; i <= digit; i++){
            fact *= i;
        }
        return fact;
    }
    
    public static int sumofDigitFactorials(int number){
        int sum = 0;
        int temp = Math.abs(number);
        if (temp == 0){
            return getFactorial(0);
        }
        while (temp > 0){
            int digit = temp % 10;
            sum += getFactorial(digit);
            temp /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (sumofDigitFactorials(num) == num){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
