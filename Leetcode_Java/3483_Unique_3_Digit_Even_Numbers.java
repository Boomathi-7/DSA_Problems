class Solution {
    public int totalNumbers(int[] digits) {
        int count = 0;
        int n = digits.length;
        boolean[] seen = new boolean[1000];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    if (i != j && i != k && j != k && digits[i] != 0 && digits[k] % 2 == 0){
                        int num = digits[i]*100 + digits[j]*10 + digits[k];
                        if (seen[num] == false){
                            count += 1;
                            seen[num] = true;
                        }
                    }
                }
            }
        }
        return count;
    }
}
