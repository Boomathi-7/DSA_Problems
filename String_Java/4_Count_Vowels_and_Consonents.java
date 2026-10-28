// Count the number of vowels and consonants in a string. 
// Test Case: Hello 
// Expected Output: Vowels = 2, Consonants = 3 
// Concept: Character Checking

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int vowel = 0;
        int consonent = 0;
        String s = str.toLowerCase();
        for (int i = 0; i < s.length(); i++){
            if (Character.isLetter(s.charAt(i))){
                if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                    vowel++;
                }
                else{
                    consonent++;
                }
            }
        }
        System.out.println("Vowel: " + vowel);
        System.out.println("Consonent: " + consonent);
    }
}
