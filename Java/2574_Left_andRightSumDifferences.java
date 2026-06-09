class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        leftSum[0] = 0;
        rightSum[n-1] = 0;
        for (int i = 0; i < n-1; i++){
            leftSum[i+1] = leftSum[i] + nums[i];
        }
        for (int j = n-2; j >= 0; j--){
            rightSum[j] = rightSum[j+1] + nums[j+1];
        }
        int[] res = new int[n];
        for (int k = 0; k < n; k++){
            res[k] = Math.abs(leftSum[k] - rightSum[k]);
        }
        return res;
    }
}
