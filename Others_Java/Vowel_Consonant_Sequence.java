import java.util.Scanner;
class Main {
    static String VowelConsonantSequence(String str) throws java.lang.Exception
    {
        String res = "";
        for (char c: str.toCharArray()){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                res += 'V';
            }
            else{
                res += 'C';
            }
        }
        String ans = "";
        int n = res.length();
        ans += res.charAt(0);
        for (int i = 1; i < n; i++){
            if (res.charAt(i) != res.charAt(i-1)){
                ans += res.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(VowelConsonantSequence(str));
    }
}
