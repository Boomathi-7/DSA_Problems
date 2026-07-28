import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++){
            System.out.print(first+" ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
