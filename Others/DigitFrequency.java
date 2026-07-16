import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int digit = scan.nextInt();
        int temp = num;
        int length = Integer.toString(num).length();
        int[] digits = new int[length];
        
        for (int i = length - 1; i >= 0; i--){
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        int count = 0;
        for (int j = 0; j < length; j++){
            if (digits[j] == digit){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
