// Count the number of vowels in a string. 
// Test Case: Education 
// Expected Output: 5 
// Concept: Character Checking

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int count = 0;
        String s = str.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
