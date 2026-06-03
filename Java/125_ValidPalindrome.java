// class Solution {
//     public boolean isPalindrome(String s) {
//         StringBuilder str = new StringBuilder();

//         for (char c: s.toCharArray()){
//             if (Character.isLetterOrDigit(c)){
//                 str.append(Character.toLowerCase(c));
//             }
//         }
//         String st = str.toString();

//         String reverse = new StringBuilder(st).reverse().toString();
//         return st.equals(reverse);
//     }
// }

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for (char c: s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }
        String st = str.toString();

        int n = st.length();
        for (int i = 0; i < n/2; i++){
            if (st.charAt(i) != st.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
