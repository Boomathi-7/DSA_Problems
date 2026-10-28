// Find the length of a string without using built-in length() or len(). 
// Test Case: COMPUTER 
// Expected Output: 8 
// Concept: String Traversal 

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] arr = str.toCharArray();
        int i = 0;
        int count = 0;
        for (char s: arr){
            count++;
        }
        System.out.println(count);
    }
}
