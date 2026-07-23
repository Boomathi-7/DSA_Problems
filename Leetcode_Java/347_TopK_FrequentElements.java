class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return new int[0];

        int[] original = Arrays.copyOf(nums, n);

        Arrays.sort(nums);
        int i = 0;
        for (int j = 1; j < n; j++){
            if (nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }

        int[] unique = Arrays.copyOf(nums, i+1);

        int len = unique.length;
        int[] count = new int[len];

        for (int m = 0; m < len; m++){
            for (int j = 0; j < n; j++){
                if (unique[m] == original[j]){
                    count[m]++;
                }
            }
        }

        int[] res = new int[k];
        for (int l = 0; l < k; l++){
            int maxIndex = 0;
            for (int p = 1; p < len; p++){
                if (count[p] > count[maxIndex]){
                    maxIndex = p;
                }
            }

            res[l] = unique[maxIndex];
            count[maxIndex] = -1;
        }
        return res;
    }
}
