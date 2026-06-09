class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int res = 1;
        int zero = 0;
        for (int i = 0; i < n; i++){
            if (nums[i] == 0){
                zero += 1;
            }
            else{
                res = res * nums[i];
            }
        }
        for (int j = 0; j < n; j++){
            if (zero == 1){
                if (nums[j] == 0){
                    ans[j] = res;
                }
                else{
                    ans[j] = 0;
                }
            }
            else if (zero > 1){
                ans[j] = 0;
            }
            else{
                ans[j] = res/nums[j];
            }
        }
        return ans;
    }
}
