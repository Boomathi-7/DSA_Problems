class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        int odd = 0;
        int even = 1;
        int prefixSum = 0;
        int res = 0;
        final int MOD = 1_000_000_007;
        for (int i = 0; i < n; i++){
            prefixSum += arr[i];
            if (prefixSum % 2 != 0){
                res = (res + even) % MOD;
                odd++;
            }
            else{
                res = (res + odd) % MOD;
                even++;
            }
        }
        return res;
    }
}
