class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n==1){
            return;
        }
        if ((k+1)%n == 0){
            k = n-1;
        }
        else{
            k = k%n;
        }
        int[] res = new int[n];
        for(int i = k; i < n; i++){
            res[i] = nums[i-k];
        }
        for (int i = n-k; i < n; i++){
            res[i-n+k] = nums[i];
        }
        for (int i = 0; i < n; i++){
            nums[i] = res[i];
        }
    }
}
