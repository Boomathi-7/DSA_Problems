class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        boolean incremented = false;
        for (int i = n-1; i >= 0; i--){
            if (digits[i] == 9){
                digits[i] = 0;
            }
            else{
                digits[i] += 1;
                incremented = true;
                break;
            }
        }
        if (incremented == false){
            int[] res = new int[n+1];
            res[0] = 1;
            for (int i = 1; i <= n; i++){
                res[i] = 0;
            }
            return res;
        }
        return digits;
    }
}
