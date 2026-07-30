// Optimal Solution
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        int max = 0;
        for (int num : set){
            if (!set.contains(num-1)){
                int current = num;
                int length = 1;
                while (set.contains(current+1)){
                    current++;
                    length++;
                }
                if (length > max){
                    max = length;
                }
            }
        }
        return max;
    }
}


// Time limit exceeded
class Solution {
    public boolean exists(int[] nums, int target){
        for (int j = 0; j < n; j++){
            if (nums[j] == target){
                return true;
            }
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++){
            int current = nums[i];
            int length = 1;
            while (exists(nums, current+1)){
                current++;
                length++;
            }
            if (length > max){
                max = length;
            }
        }
        return max;
    }
}
