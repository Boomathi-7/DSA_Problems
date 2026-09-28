class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int depth = 0;
        int max = 0;
        for (int i = 0; i < n; i++){
            if (s.charAt(i) == '('){
                depth++;
            }
            else if (s.charAt(i) == ')'){
                depth--;
            }
            if (depth > max){
                max = depth;
            }
        }
        return max;
    }
}
