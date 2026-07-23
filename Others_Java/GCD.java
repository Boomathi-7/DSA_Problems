// Using for loop

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int gcd = 1;
        
        for (int i = 1; i <= n1 && i <= n2; i++){
            if (n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD: " + gcd);
    }
}

// Using EuclideanAlgorithm

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        // Can be used for print statement
        // int originaln1 = n1;
        // int originaln2 = n2;
        
        while (n2 != 0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        System.out.println("GCD: "+n1);
    }
}

// Using Built-in Method
// BigInteger - used to avoid Integer overflow

import java.util.*;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        
        BigInteger b1 = BigInteger.valueOf(n1);
        BigInteger b2 = BigInteger.valueOf(n2);
        
        BigInteger gcd = b1.gcd(b2);
        
        System.out.println("GCD: " + gcd);
    }
}
