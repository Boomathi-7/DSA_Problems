// Optimal Solution
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        for (int j = 1; j <= n+1; j++){
            if (!set.contains(j)){
                return j;
            }
        }
        return n+1;
    }
}


// Time limit exceeded
class Solution {
    public boolean exists(int[] nums, int target){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                return true;
            }
        }
        return false;
    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int j = 1; j <= n+1; j++){
            if (!exists(nums, j)){
                return j;
            }
        }
        return n+1;
    }
}
