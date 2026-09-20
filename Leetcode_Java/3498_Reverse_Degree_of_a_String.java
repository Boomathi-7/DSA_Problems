class Solution {
    public int reverseDegree(String s) {
        int total = 0;
        int n = s.length();
        for (int i = 0; i < n; i++){
            int normal = (s.charAt(i) - 'a') + 1;
            int reverse = 27 - normal;
            int pos = i+1;
            total += reverse*(i+1);
        }
        return total;
    }
}
