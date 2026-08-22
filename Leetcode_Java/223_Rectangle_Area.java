class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int l1 = ax2 - ax1;
        int b1 = ay2 - ay1;
        int l2 = bx2 - bx1;
        int b2 = by2 - by1;
        int area1 = l1*b1;
        int area2 = l2*b2;
        int left = Math.max(ax1, bx1);
        int right = Math.min(ax2, bx2);
        int bottom = Math.max(ay1, by1);
        int top = Math.min(ay2, by2);
        int l = Math.max(0, right - left);
        int b = Math.max(0, top - bottom);
        int overlap = l*b;
        int area = area1 + area2 - overlap;
        return area;
    }
}
