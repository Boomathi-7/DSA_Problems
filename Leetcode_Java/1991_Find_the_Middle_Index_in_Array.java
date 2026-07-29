class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++){
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++){
                leftSum += nums[j];
            }
            for (int k = i+1; k < n; k++){
                rightSum += nums[k];
            }
            if (leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}


// Optimal Solution

class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++){
            totalSum += nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++){
            int rightSum = 0;
            rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
