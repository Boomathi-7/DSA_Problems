// Optimal Solution


// Time limit exceeded
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = i; j < n; j++){
                sum += nums[j];
                if (sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
}
