class Solution {
    public int maxProduct(int n) {
        int len = String.valueOf(Math.abs(n)).length(); 
        int[] digits = new int[len];
        int index = 0;
        while(n>0){
            digits[index] = n%10;
            n /= 10;
            index++;
        }
        int max = 0;
        for (int i = 0; i < len-1; i++){
            for (int j = i+1; j < len; j++){
                int product = digits[i]*digits[j];
                if (product > max){
                    max = product;
                }
            }
        }
        return max;
    }
}
