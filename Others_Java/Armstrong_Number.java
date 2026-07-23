// Using Mathematical Logic

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp = num;
        int totaldigits = 0;
        int sum = 0;
        
        while (temp > 0){
            totaldigits++;
            temp /= 10;
        }
        
        temp = num;
        while (temp > 0){
            int digit = temp % 10;
            sum += Math.pow(digit, totaldigits);
            temp /= 10;
        }
        
        if (sum == num){
            System.out.println(num + " is Armstrong Number");
        }
        else{
            System.out.println(num + " is not Armstrong Number");
        }
    }
}


// Using String Conversion

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String numStr = Integer.toString(num);
        int n = numStr.length();
        int sum = 0;
        
        for (int i = 0; i < n; i++){
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, n);
        }
        
        if (sum == num){
            System.out.println(num + " is Armstrong Number");
        }
        else{
            System.out.println(num + " is not Armstrong Number");
        }
    }
}
