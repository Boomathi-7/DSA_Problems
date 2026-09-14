class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean horizontal = false;
        boolean vertical = false;
        if (rec1[0] < rec2[2] && rec2[0] < rec1[2]){
            horizontal = true;
        }
        if (rec1[1] < rec2[3] && rec2[1] < rec1[3]){
            vertical = true;
        }
        if (horizontal && vertical){
            return true;
        }
        return false;
    }
}
