import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int lcm = findLCM(n1, n2);
        System.out.println("LCM: " + lcm);
    }
    
    public static int findLCM(int a, int b){
        if (a == 0 || b == 0){
            return 0;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        int max = Math.max(a, b);
        int currentMultiple = max;
        
        while (currentMultiple % Math.min(a, b) != 0){
            currentMultiple += max;
        }
        return currentMultiple;
    }
}
