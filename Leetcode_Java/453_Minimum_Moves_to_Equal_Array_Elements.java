class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        for (int i = 1; i < n; i++){
            if (nums[i] < min){
                min = nums[i];
            }
        }
        int moves = 0;
        for (int j = 0; j < n; j++){
            moves += nums[j] - min;
        }
        return moves;
    }
}
