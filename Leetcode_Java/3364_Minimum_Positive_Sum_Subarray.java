class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            int sum = 0;
            for (int j = i; j <= Math.min(n-1, i+r-1); j++){
                sum += nums.get(j);
                int length = j-i+1;
                if (length >= l && sum > 0){
                    min = Math.min(sum, min);
                }
            }
        }
        if (min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
