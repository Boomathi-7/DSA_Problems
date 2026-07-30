class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            sum += nums[i];
            while (sum >= target){
                int length = i - left + 1;
                if (length < minLength){
                    minLength = length;
                }
                sum -= nums[left];
                left++;
            }
        }
        if (minLength == Integer.MAX_VALUE){
            return 0;
       }
       return minLength;
    }
}
