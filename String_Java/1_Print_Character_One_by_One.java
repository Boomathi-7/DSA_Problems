// Print every character of a string one by one in the same order.
// Test Case: HELLO  
// Expected Output: H E L L O 
// Concept: String Traversal 

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for (int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }
}
