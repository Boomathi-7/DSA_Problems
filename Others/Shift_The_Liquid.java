// Moves = (n+m-1)/m

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int count = (n+m-1)/m;
        System.out.println(count);
    }
}
