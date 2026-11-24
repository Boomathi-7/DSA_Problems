class Solution {
    public int maxLength(int[] nums) {
        int maxLength = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++){
            int product = 1;
            int gcd = 0;
            int lcm = 1;
            for (int j = i; j < n; j++){
                product *= nums[j];
                gcd = findGCD(gcd, nums[j]);
                lcm = (lcm * nums[j])/findGCD(lcm, nums[j]);
                if (product == lcm * gcd){
                    int length = j - i + 1;
                    if (length > maxLength){
                        maxLength = length;
                    }
                }
            }
        }
        return maxLength;
    }
    public int findGCD(int a, int b){
        while(a % b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }
}
