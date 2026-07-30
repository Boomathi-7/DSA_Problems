class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLength = 0;
        map.put(0, -1);
        for (int i = 0; i < n; i++){
            if (nums[i] == 0){
                prefixSum--;
            }
            else{
                prefixSum++;
            }
            if (map.containsKey(prefixSum)){
                int length = i - map.get(prefixSum);
                if (length > maxLength){
                    maxLength = length;
                }
            }
            else{
                map.put(prefixSum, i);
            }
        }
        return maxLength;
    }
}
